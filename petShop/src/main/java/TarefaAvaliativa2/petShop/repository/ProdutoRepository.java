package TarefaAvaliativa2.petShop.repository;

import TarefaAvaliativa2.petShop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
