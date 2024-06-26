package pedro.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedro.sa.repository.ProdutoRepository;

@RestController
@RequestMapping("Produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;
}
