package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                             //NOTAÇÇÃO UTILIZADA PARA INFORMAR AO SPRING QUE ESSA É UMA CLASSE CONTROLLER.
@RequestMapping("/teste")                   //MAPEIA A ROTA[URL] DE REQUISIÇÃO.
public class TesteController {
    @GetMapping                             //MÉTODO CHAMADO PELA REQUISIÇÃO RECEBIDA NA ROTA CENTRAL.
    public String testeUso(){
        return "Teste efetuado com sucesso! Spring funcionando corretamente!";
    }
}
