package TarefaAvaliativa2.petShop.controller;


import TarefaAvaliativa2.petShop.controller.request.AdicionarProdutoRequest;
import TarefaAvaliativa2.petShop.controller.request.IniciarAtendimentoRequest;
import TarefaAvaliativa2.petShop.controller.request.EditarAtendimentoRequest;
import TarefaAvaliativa2.petShop.controller.request.AdicionarPagamentoRequest;
import TarefaAvaliativa2.petShop.controller.response.AtendimentoResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/atendimentos")
public class
AtendimentoController {

    @PostMapping
    public void iniciarAtendimento(
            @RequestBody IniciarAtendimentoRequest iniciarAtedimentoRequest
    ) {

    }

    @GetMapping
    public List<AtendimentoResponse> buscarAtendimento(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) List<String> sort,
            @RequestParam(required = false) LocalDate dataAberturaInicio,
            @RequestParam(required = false) LocalDate dataAberturaFim,
            @RequestParam(required = false) LocalDate dataEncerramentoInicio,
            @RequestParam(required = false) LocalDate dataEncerramentoFim,
            @RequestParam(required = false) Integer idCliente
    ) {
        return List.of(
                AtendimentoResponse.builder()
                        .id(1)
                        .id(1)
                        .dataAbertura(LocalDateTime.now())
                        .estado("ABERTO")
                        .valorConsulta(11000)
                        .nomeAtendente("Flavio")
                        .nomeVeterinario("Luana")
                        .idCliente(2)
                        .build()
        );
    }

    @PatchMapping("/{id}")
    public void editarAtendimento(
            @PathVariable Integer id,
            @RequestBody EditarAtendimentoRequest editarRequest
    ) {

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