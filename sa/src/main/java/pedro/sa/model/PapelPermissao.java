package pedro.sa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PapelPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "idPapel")
    private Papel papel;

    @OneToOne
    @JoinColumn(name = "idPermissao")
    private Permissao permissao;
}
