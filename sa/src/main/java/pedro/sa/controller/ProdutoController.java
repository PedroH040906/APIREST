package pedro.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.produto.ProdutoRequestDTO;
import pedro.sa.DTO.produto.ProdutoResponseDTO;
import pedro.sa.model.Produto;
import pedro.sa.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<ProdutoResponseDTO> getAll() {
        List<ProdutoResponseDTO> produtoList = repository.findAll().stream().map(ProdutoResponseDTO::new).toList();
        return produtoList;
    }

    @PostMapping
    public void postProduto(@RequestBody ProdutoRequestDTO data) {
        Produto produtoData = new Produto(data);
        repository.save(produtoData);
        return;
    }
    public void deleteProduto(@PathVariable Long id) {
        Optional<Produto> produtoData = repository.findById(id);
        if (produtoData.isPresent()) {
            repository.delete(produtoData.get());
        }
    }
    @PutMapping
    public void updateProduto(@RequestBody ProdutoRequestDTO data) {
        Produto produtoData = new Produto(data);
        repository.save(produtoData);
    }
}
