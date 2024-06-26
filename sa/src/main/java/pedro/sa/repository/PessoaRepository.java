package pedro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.sa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
