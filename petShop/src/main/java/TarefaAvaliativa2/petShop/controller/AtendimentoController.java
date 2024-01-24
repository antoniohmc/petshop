package TarefaAvaliativa2.petShop.controller;


import TarefaAvaliativa2.petShop.controller.atendimento.*;
import TarefaAvaliativa2.petShop.controller.produto.AdicionarProdutoRequest;
import TarefaAvaliativa2.petShop.controller.request.AdicionarPagamentoRequest;
import TarefaAvaliativa2.petShop.model.Atendimento;
import TarefaAvaliativa2.petShop.service.AtendimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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
    public List<AtendimentoResponse> listarAtendimento(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) List<String> sort,
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