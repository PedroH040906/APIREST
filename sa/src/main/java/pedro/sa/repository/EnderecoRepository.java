package pedro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.sa.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
