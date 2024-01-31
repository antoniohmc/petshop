package tarefaavaliativa2.petshop.service.produto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.produto.Produto;
import tarefaavaliativa2.petshop.model.produto.QuantidadeEstoque;
import tarefaavaliativa2.petshop.repository.produto.ProdutoPersistenceService;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoPersistenceService produtoPersistenceService;

    public Produto criar(Produto produto) {

        return produtoPersistenceService.criar(produto);
    }

    public Produto atualizar(Integer id, Produto produto) {

        Produto existente = produtoPersistenceService.buscarPorId(id);

        Produto atualizado = Produto.builder()
                .id(existente.getId())
                .nome(produto.getNome())
                .valor(produto.getValor())
                .descricao(produto.getDescricao())
                .quantidadeEstoque(QuantidadeEstoque.builder()
                        .id(existente.getId())
                        .quantidadeAtual(produto.getQuantidadeEstoque().getQuantidadeAtual())
                        .build())
                .build();

        return produtoPersistenceService.atualizar(atualizado);
    }

    public Collection<Produto> buscarProdutos(String nome, Integer valorMenorQue, Integer valorMaiorQue) {

        return produtoPersistenceService.buscarProdutos(nome, valorMenorQue, valorMaiorQue);
    }

    public Produto buscarProdutoPorId(Integer produtosId) {

        return produtoPersistenceService.buscarPorId(produtosId);
    }

    public void excluir(Integer id) {

        produtoPersistenceService.excluir(id);
    }

}
