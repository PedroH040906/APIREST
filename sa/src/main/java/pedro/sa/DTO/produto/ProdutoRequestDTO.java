package pedro.sa.DTO.produto;

import pedro.sa.model.Produto;

public record ProdutoRequestDTO(Produto.Tipo tipo, Produto.Tamanho tamanho, String cor, String tecido, Boolean estampa){
}
