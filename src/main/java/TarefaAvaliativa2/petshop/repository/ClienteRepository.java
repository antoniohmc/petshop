package tarefaavaliativa2.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tarefaavaliativa2.petshop.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
