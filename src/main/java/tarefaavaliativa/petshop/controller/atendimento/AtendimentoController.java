package tarefaavaliativa.petshop.controller.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;
import tarefaavaliativa.petshop.model.atendimento.ProdutoSolicitado;
import tarefaavaliativa.petshop.service.atendimento.AtendimentoService;

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
    Collection<AtendimentoResponse> listarAtendimentos() {

        return atendimentoService.buscarAtendimentos()
                .stream()
                .map(AtendimentoMapper::mapToAtendimentoResponse)
                .toList();
    }

    @PostMapping("/{id}/produtos")
    AtendimentoResponse adicionarProdutos(@PathVariable Integer id,
                                          @RequestBody Collection<AtendimentoProdutoRequest> requests) {

        Collection<ProdutoSolicitado> produtosSolicitados = AtendimentoMapper.mapToProdutosSolicitados(requests);

        return AtendimentoMapper.mapToAtendimentoResponse(atendimentoService.adicionarProdutos(id, produtosSolicitados));
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