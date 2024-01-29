package tarefaavaliativa2.petshop.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tarefaavaliativa2.petshop.model.cliente.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
