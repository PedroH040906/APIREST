package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedro.sa.DTO.pessoa.PessoaRequestDTO;
import pedro.sa.DTO.pessoa.PessoaResponseDTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPessoa")
    private Long idPessoa;

    private String nome;
    private String tipo;
    private String telefone;
    private String obs;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    private Endereco endereco;

    public Pessoa(PessoaResponseDTO data) {
        this.nome = data.nome();
        this.tipo = data.tipo();
        this.telefone = data.telefone();
        this.obs = data.obs();
        this.endereco = data.endereco();
    }
}