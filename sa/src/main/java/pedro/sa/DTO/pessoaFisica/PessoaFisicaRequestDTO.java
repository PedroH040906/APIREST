package pedro.sa.DTO.pessoaFisica;

import pedro.sa.model.Pessoa;

import java.util.Date;

public record PessoaFisicaRequestDTO(Pessoa pessoa, String cpf, Date dataNascimento, char genero) {
}
