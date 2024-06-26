package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Adicionado campo id como chave primária

    @OneToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;

    private String cpf;
    private Date dataNascimento;
    private char genero;
}