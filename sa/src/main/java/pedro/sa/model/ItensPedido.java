package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "itens_pedido")
public class ItensPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItensPedido;

    @ManyToOne
    @JoinColumn(name = "idPedido", referencedColumnName = "idPedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "idProduto")
    private Produto produto;

    private int qtd;
    private double valorUnitario;
    private double valorTotal;
}
