package tarefaavaliativa.petshop.service.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;
import tarefaavaliativa.petshop.model.atendimento.AtendimentoProduto;
import tarefaavaliativa.petshop.model.produto.Produto;
import tarefaavaliativa.petshop.service.produto.ProdutoService;
import tarefaavaliativa.petshop.model.atendimento.ProdutoSolicitado;

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
