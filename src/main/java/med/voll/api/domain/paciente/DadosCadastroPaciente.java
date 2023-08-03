package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "nome é obrigatório")
        String nome,
        @NotBlank(message = "email é obrigatório")
        @Email
        String email,

        @NotBlank(message = "telefone é obrigatório")
        String telefone,
        @NotBlank(message = "cpf é obrigatorio")
        @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotNull(message = "endereço é obrigatorio") @Valid DadosEndereco endereco) {
}
