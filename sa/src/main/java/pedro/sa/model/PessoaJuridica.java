package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Adicionado campo id como chave primária

    @OneToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;

    private String cnpj;
    private String nomeFantasia;
    private String tipo;
    private String ie;
    private String im;
    private String ramoAtividade;
}