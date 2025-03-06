package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull  //CAMPO OBRIGATÓRIO PARA RECEBER O PEDIDO DE ATUALIZAÇÃO.
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
