package tarefaavaliativa.petshop.service.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;
import tarefaavaliativa.petshop.model.atendimento.AtendimentoProduto;
import tarefaavaliativa.petshop.model.cliente.Cliente;
import tarefaavaliativa.petshop.service.cliente.ClienteService;
import tarefaavaliativa.petshop.service.produto.ProdutoService;
import tarefaavaliativa.petshop.model.atendimento.ProdutoSolicitado;
import tarefaavaliativa.petshop.repository.atendimento.AtendimentoPersistenceService;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final ProdutoService produtoService;

    private final ClienteService clienteService;

    private final AtendimentoProdutoService atendimentoProdutoService;

    private final AtendimentoPersistenceService atendimentoPersistenceService;

    public Atendimento iniciar(Atendimento atendimento, Integer clienteId, Collection<ProdutoSolicitado> produtosSolicitados) {

        Cliente cliente = clienteService.buscarPorId(clienteId);
        atendimento.adicionarCliente(cliente);

        Collection<AtendimentoProduto> atendimentoProdutos = atendimentoProdutoService.vincularProduto(atendimento, produtosSolicitados);
        atendimento.adicionarProdutos(atendimentoProdutos);

        return atendimentoPersistenceService.iniciar(atendimento);
    }

    public Collection<Atendimento> buscarAtendimentos() {

        return atendimentoPersistenceService.buscarAtendimentos();
    }

    public Atendimento adicionarProdutos(Integer atendimentoId, Collection<ProdutoSolicitado> produtosSolicitados) {

        Atendimento atendimento = atendimentoPersistenceService.buscarPorId(atendimentoId);

        Collection<AtendimentoProduto> atendimentoProdutos = atendimentoProdutoService.vincularProduto(atendimento, produtosSolicitados);

        atendimento.atualizarProdutos(atendimentoProdutos);

        return atendimentoPersistenceService.atualizar(atendimento);
    }
}
