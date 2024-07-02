package pedro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedro.sa.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
