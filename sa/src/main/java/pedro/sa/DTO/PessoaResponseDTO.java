package pedro.sa.DTO;

import pedro.sa.model.Endereco;
import pedro.sa.model.Pessoa;

public record PessoaResponseDTO(String nome, String tipo, String telefone, String obs, Endereco endereco) {
    public PessoaResponseDTO(Pessoa pessoa) {
        this(pessoa.getNome(), pessoa.getTipo(), pessoa.getTelefone(), pessoa.getObs(), pessoa.getEndereco());
    }
}
