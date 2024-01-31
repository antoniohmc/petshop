package tarefaavaliativa2.petshop.service.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.atendimento.Atendimento;
import tarefaavaliativa2.petshop.model.atendimento.AtendimentoProduto;
import tarefaavaliativa2.petshop.model.atendimento.ProdutoSolicitado;
import tarefaavaliativa2.petshop.model.produto.Produto;
import tarefaavaliativa2.petshop.service.produto.ProdutoService;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class AtendimentoProdutoService {

    private final ProdutoService produtoService;

    public Collection<AtendimentoProduto> vincularProduto(Atendimento atendimento, Collection<ProdutoSolicitado> produtosSolicitados) {

        return produtosSolicitados.stream()
                .map(produtoSolicitado -> contruirAtendimentoComProdutos(atendimento, produtoSolicitado))
                .toList();
    }

    private AtendimentoProduto contruirAtendimentoComProdutos(Atendimento atendimento, ProdutoSolicitado produtoSolicitado) {

        Produto produto = produtoService.buscarProdutoPorId(produtoSolicitado.getProdutoId());

        return AtendimentoProduto.builder()
                .produto(produto)
                .atendimento(atendimento)
                .quantidade(produtoSolicitado.getQuantidade())
                .build();
    }


}
