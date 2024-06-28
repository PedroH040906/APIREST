package pedro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.sa.model.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
