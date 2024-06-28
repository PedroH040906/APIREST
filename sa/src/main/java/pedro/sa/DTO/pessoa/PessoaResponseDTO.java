package pedro.sa.DTO.pessoa;

import pedro.sa.model.Endereco;
import pedro.sa.model.Pessoa;

public record PessoaResponseDTO(Long idPessoa,String nome, String tipo, String telefone, String obs, Endereco endereco) {
    public PessoaResponseDTO(Pessoa pessoa) {
        this(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getTipo(), pessoa.getTelefone(), pessoa.getObs(), pessoa.getEndereco());
    }
}
