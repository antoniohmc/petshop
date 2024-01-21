package TarefaAvaliativa2.petShop.service;

import TarefaAvaliativa2.petShop.model.Produto;
import TarefaAvaliativa2.petShop.repository.ProdutoRepositoryImpl;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepositoryImpl produtoRepository;

    public Produto criarNovoProduto(Produto produto) {
        return produtoRepository.criarNovo(produto);
    }

    public Produto editarProduto(Integer id, Produto produto) {
        Produto existente = produtoRepository.buscarPorId(id);

        existente.setNome(produto.getNome());
        existente.setValor(produto.getValor());
        existente.setDescricao(produto.getDescricao());

        return produtoRepository.atualizar(produto);
    }

    public Collection<Produto> listarProdutos() {
        return produtoRepository.buscarProdutos();
    }

    public Produto deletarProduto(Produto produto) {
        produtoRepository.deletarProduto(produto);

        return produto;
    }

}
