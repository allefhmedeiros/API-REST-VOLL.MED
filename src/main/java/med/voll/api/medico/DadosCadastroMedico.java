package med.voll.api.medico;

import jakarta.validation.Valid; //BeanValidation
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank                               //NÃO ACEITA STRING VAZIA
        String nome,
        @NotBlank                               //NÃO ACEITA STRING VAZIA
        @Email                                  //VALIDA A ESTRUTURA DA STRING, PRECISA SEGUIR AS REGRAS DE COMPOSIÇÃO DE E-MAIL
        String email,
        @NotBlank                               //NÃO ACEITA STRING VAZIA
        String telefone,
        @NotBlank                               //NÃO ACEITA STRING VAZIA
        @Pattern(regexp = "\\d{4,6}")           //VALIDA O FORMATO DO VALOR INSERIDO, NESSE CASO SÃO NÚMEROS DE 4 A 6 DIGITOS
        String crm,
        @NotNull                                //NÃO ACEITA VALOR VAZIO, PREENCHIMENTO OBRIGATÓRIO
        Especialidade especialidade,
        @NotNull                                //NÃO ACEITA VALOR VAZIO, PREENCHIMENTO OBRIGATÓRIO
        @Valid                                  //INFORMA QUE DENTRO DO OBJETO ENDEREÇO TAMBÉM HÁ CAMPOS QUE DEVEM SER VALIDADOS.
        DadosEndereco endereco) {

}
