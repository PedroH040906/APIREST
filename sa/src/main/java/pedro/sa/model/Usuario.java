package pedro.sa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario; // Alterado para Long

    private Date dataCadastro;
    private String senha;
    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "papel_permissao_id", referencedColumnName = "id")
    private PapelPermissao papelPermissao;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id", referencedColumnName = "idPessoa")
    private Pessoa pessoa;
}