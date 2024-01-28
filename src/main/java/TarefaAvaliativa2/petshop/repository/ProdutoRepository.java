package TarefaAvaliativa2.petshop.repository;

import TarefaAvaliativa2.petshop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
