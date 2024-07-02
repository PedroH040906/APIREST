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
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    private Date dataPedido;
    private Date dataEntrega;
    private String descricao;
    private Status status;

    public enum Status{
        CORTANDO,
        COSTURANDO,
        ESTAMPANDO,
        CANCELADO,
        CONCLUIDO,
    }
}
