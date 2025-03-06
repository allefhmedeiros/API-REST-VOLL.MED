package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository reposiroty;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        reposiroty.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao){
        return reposiroty.findAll(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        //CONSULTA DE DADOS DO MÉDICO QUE SERÁ ATUALIZADO.
        var medico = reposiroty.getReferenceById(dados.id());                                                           //CONSULTA DE DADOS DO MÉDICO QUE SERÁ ATUALIZADO.
        medico.atualizarInformacoes(dados);
    }

}
