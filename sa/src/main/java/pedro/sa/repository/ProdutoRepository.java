package pedro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.sa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
