package pedro.sa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedro.sa.DTO.produto.ProdutoRequestDTO;

@Table(name = "produto")
@Entity(name = "produto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduto;

    private Tipo tipo;
    private Tamanho tamanho;
    private String cor;
    private String tecido;
    private Boolean estampa;

    public enum Tipo{
        CALCA,
        CAMISETA,
        CAMISA,
        SHORTS,
        MEIA,
    }
    public enum Tamanho{
        PP,
        P,
        M,
        G,
        GG,
    }

    public Produto(ProdutoRequestDTO data) {
        this.estampa = data.estampa();
        this.tipo = data.tipo();
        this.cor = data.cor();
        this.tecido = data.tecido();
        this.tamanho = data.tamanho();
    }
}
