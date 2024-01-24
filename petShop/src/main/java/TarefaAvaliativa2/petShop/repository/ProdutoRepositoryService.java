package TarefaAvaliativa2.petShop.repository;

import TarefaAvaliativa2.petShop.model.Produto;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoRepositoryService {

    private final ProdutoRepository produtoRepository;

    public Produto criarNovo(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto buscarPorId(Integer id) {
        return produtoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não encontrado, digite um id válido"));
    }

    public Produto atualizar(Produto produto) {
        return criarNovo(produto);
    }

    public Collection<Produto> buscarProdutos() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Integer id) {
        produtoRepository.deleteById(id);
    }


}
