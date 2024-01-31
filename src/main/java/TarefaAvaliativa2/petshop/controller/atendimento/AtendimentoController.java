package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tarefaavaliativa2.petshop.model.atendimento.Atendimento;
import tarefaavaliativa2.petshop.model.atendimento.ProdutoSolicitado;
import tarefaavaliativa2.petshop.service.atendimento.AtendimentoService;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/atendimentos")
class AtendimentoController {

    private final AtendimentoService atendimentoService;

    @PostMapping
    AtendimentoResponse iniciar(@RequestBody AtendimentoRequest request) {

        Atendimento atendimento = AtendimentoMapper.mapToAtendimento(request);
        Collection<ProdutoSolicitado> produtosSolicitados = AtendimentoMapper.mapToProdutosSolicitados(request.getAtendimentoProdutos());
        Atendimento iniciado = atendimentoService.iniciar(atendimento, request.getClienteId(), produtosSolicitados);

        return AtendimentoMapper.mapToAtendimentoResponse(iniciado);
    }

    @GetMapping
    Collection<Atendimento> listarAtendimentos() {

        return atendimentoService.buscarAtendimentos();
    }

    @PostMapping("/{id}/produtos")
    void adicionarProdutos(@RequestBody AdicionarProdutoAtendimentoRequest request) {

    }

    @DeleteMapping("/{id}/produtos")
    void removerProdutos(@RequestBody AdicionarProdutoAtendimentoRequest adicionarProdutoRequest) {

    }

    @PostMapping("/{id}/pagamentos")
    void adicionarPagamento(@RequestBody AdicionarPagamentoRequest adicionarPagamento) {

    }

    @PostMapping("/{id}/finalizar")
    void finalizarAtendimento(@PathVariable Long id) {

    }
}