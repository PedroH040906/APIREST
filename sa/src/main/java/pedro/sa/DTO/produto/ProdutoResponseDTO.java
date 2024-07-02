package pedro.sa.DTO.produto;

import pedro.sa.model.Produto;

public record ProdutoResponseDTO(Long idProduto, Produto.Tipo tipo, Produto.Tamanho tamanho, String cor, String tecido, Boolean estampa) {
    public ProdutoResponseDTO(Produto produto){
        this(produto.getIdProduto(), produto.getTipo(), produto.getTamanho(), produto.getCor(),produto.getTecido(),produto.getEstampa());
    }
}
