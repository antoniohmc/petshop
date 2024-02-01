package tarefaavaliativa.petshop.repository.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tarefaavaliativa.petshop.model.produto.Produto;

import java.util.Collection;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("SELECT p FROM Produto p " +
            "WHERE (:nome IS NULL OR p.nome = :nome) AND " +
            "(:valorMenorQue IS NULL OR p.valor < :valorMenorQue) AND " +
            "(:valorMaiorQue IS NULL OR p.valor > :valorMaiorQue)")
    Collection<Produto> findByNomeAndValorGreaterThanAndValorLessThan(String nome, Integer valorMenorQue, Integer valorMaiorQue);

}
