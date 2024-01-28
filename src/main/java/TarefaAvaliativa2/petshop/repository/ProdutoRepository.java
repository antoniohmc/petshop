package tarefaavaliativa2.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tarefaavaliativa2.petshop.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
