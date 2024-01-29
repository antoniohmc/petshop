package tarefaavaliativa2.petshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tarefaavaliativa2.petshop.controller.atendimento.AtendimentoMapper;
import tarefaavaliativa2.petshop.controller.atendimento.AtendimentoResponse;
import tarefaavaliativa2.petshop.controller.atendimento.EditarAtendimentoRequest;
import tarefaavaliativa2.petshop.controller.atendimento.IniciarAtendimentoMapper;
import tarefaavaliativa2.petshop.controller.atendimento.IniciarAtendimentoRequest;
import tarefaavaliativa2.petshop.controller.atendimento.IniciarAtendimentoResponse;
import tarefaavaliativa2.petshop.controller.produto.AdicionarProdutoRequest;
import tarefaavaliativa2.petshop.controller.request.AdicionarPagamentoRequest;
import tarefaavaliativa2.petshop.model.Atendimento;
import tarefaavaliativa2.petshop.service.AtendimentoService;

import java.time.LocalDate;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/atendimentos")
public class
AtendimentoController {

    private final AtendimentoService atendimentoService;

    @PostMapping
    public IniciarAtendimentoResponse iniciarAtendimento(
            @RequestBody IniciarAtendimentoRequest iniciarAtedimentoRequest
    ) {

        Atendimento model = iniciarAtedimentoRequest.toModel();
        Atendimento iniciado = atendimentoService.iniciarAtendimento(model);

        return IniciarAtendimentoMapper.mapToInicarAtendimentoResponse(iniciado);

    }

    @GetMapping
    public Collection<AtendimentoResponse> listarAtendimento(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) Collection<String> sort,
            @RequestParam(required = false) LocalDate dataAberturaInicio,
            @RequestParam(required = false) LocalDate dataAberturaFim,
            @RequestParam(required = false) LocalDate dataEncerramentoInicio,
            @RequestParam(required = false) LocalDate dataEncerramentoFim,
            @RequestParam(required = false) Integer idCliente
    ) {
        return atendimentoService.listarAtendimentos()
                .stream()
                .map(AtendimentoMapper::mapToAtendimentoResponse)
                .toList();
    }

    @PatchMapping("/{id}")
    public AtendimentoResponse editarAtendimento(
            @PathVariable Integer id,
            @RequestBody EditarAtendimentoRequest editarAtendimentoRequest
    ) {
        return AtendimentoMapper
                .mapToAtendimentoResponse(atendimentoService.editarAtendimento(editarAtendimentoRequest.toModel(), id));

    }

    @PostMapping("/{id}/produtos")
    public void adicionarProdutos(@RequestBody AdicionarProdutoRequest adicionarProdutoRequest) {

    }

    @DeleteMapping("/{id}/produtos")
    public void removerProdutos(@RequestBody AdicionarProdutoRequest adicionarProdutoRequest) {

    }

    @PostMapping("/{id}/pagamentos")
    public void adicionarPagamento(@RequestBody AdicionarPagamentoRequest adicionarPagamento) {

    }

    @PostMapping("/{id}/finalizar")
    public void finalizarAtendimento(
            @PathVariable Long id
    ) {

    }
}