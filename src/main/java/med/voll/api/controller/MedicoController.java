package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository reposiroty;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedico dados, UriComponentsBuilder uriBuilder){
        var medico = new Medico(dados);
        reposiroty.save(medico);
        var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri() ;
        return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemMedico>> listar(Pageable paginacao){
        var page = reposiroty.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
        return ResponseEntity.ok(page);     //BOAS PRÁTICAS --> VAI DEVOLVER O CÓDIGO 200 E  PAGINAÇÃO SOLICITADA.
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        //CONSULTA DE DADOS DO MÉDICO QUE SERÁ ATUALIZADO.
        var medico = reposiroty.getReferenceById(dados.id());      //CONSULTA DE DADOS DO MÉDICO QUE SERÁ ATUALIZADO.
        medico.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){
        var medico = reposiroty.getReferenceById(id);
        medico.excluir();
        return ResponseEntity.noContent().build();  //BOA PRÁTICA --> DEVOLVER CÓDIGO 204 NO CONTENT
        //reposiroty.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var medico = reposiroty.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));  //BOA PRÁTICA --> DEVOLVER CÓDIGO 204 NO CONTENT
        //reposiroty.deleteById(id);
    }

}
