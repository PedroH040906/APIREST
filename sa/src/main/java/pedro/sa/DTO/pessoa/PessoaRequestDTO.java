package pedro.sa.DTO.pessoa;

import pedro.sa.model.Endereco;

public record PessoaRequestDTO(String name, String tipo, String telefone, String obs, Endereco endereco) {
}
