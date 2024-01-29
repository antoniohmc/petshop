package tarefaavaliativa2.petshop.repository.produto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.produto.Produto;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProdutoPersistenceService {

    private final ProdutoRepository produtoRepository;

    public Produto criar(Produto produto) {

        return produtoRepository.saveAndFlush(produto);
    }

    public Produto buscarPorId(Integer id) {

        return produtoRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum produto encontra para o id informado:" + id));
    }

    public Produto atualizar(Produto produto) {

        return produtoRepository.saveAndFlush(produto);
    }

    public Collection<Produto> buscarProdutos(String nome, Integer valorMenorQue, Integer valorMaiorQue) {

        return produtoRepository.findByNomeAndValorGreaterThanAndValorLessThan(nome, valorMenorQue, valorMaiorQue);
    }

    public void excluir(Integer id) {

        produtoRepository.deleteById(id);
    }


}
