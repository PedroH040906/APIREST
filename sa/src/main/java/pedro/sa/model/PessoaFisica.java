package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedro.sa.DTO.pessoaFisica.PessoaFisicaRequestDTO;
import pedro.sa.DTO.pessoaFisica.PessoaFisicaResponseDTO;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPessoaFisica; // Adicionado campo id como chave primária

    @OneToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;

    private String cpf;
    private Date dataNascimento;
    private char genero;

    public PessoaFisica(PessoaFisicaResponseDTO data){
        this.pessoa = data.pessoa();
        this.cpf = data.cpf();
        this.dataNascimento = data.dataNascimento();
        this.genero = data.genero();
    }
}