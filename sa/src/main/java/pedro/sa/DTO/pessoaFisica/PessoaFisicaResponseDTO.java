package pedro.sa.DTO.pessoaFisica;

import pedro.sa.model.Pessoa;
import pedro.sa.model.PessoaFisica;

import java.util.Date;

public record PessoaFisicaResponseDTO(Long idPessoaFisica, Pessoa pessoa, String cpf, Date dataNascimento, char genero) {
    public PessoaFisicaResponseDTO(PessoaFisica pessoaFisica) {
        this(pessoaFisica.getIdPessoaFisica(), pessoaFisica.getPessoa(), pessoaFisica.getCpf(), pessoaFisica.getDataNascimento(), pessoaFisica.getGenero());
    }
}
