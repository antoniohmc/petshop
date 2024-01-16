package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.request.*;
import TarefaAvaliativa2.petShop.response.AtendimentoResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/atendimentos")
public class AtendimentoController {


    @GetMapping()
    public List<AtendimentoResponse> listarAtendimento(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) List<String> sort,
            @RequestParam(required = false) LocalDateTime dataAberturaInicio,
            @RequestParam(required = false) LocalDateTime dataAberturaFim,
            @RequestParam(required = false) LocalDateTime dataEncerramentoInicio,
            @RequestParam(required = false) LocalDateTime dataEncerramentoFim,
            @RequestParam(required = false) Integer idCliente
    ) {
        return new ArrayList<>();
    }


    @PostMapping()
    public void iniciarAtendimento(@RequestBody AtendimentoRequest atendimentoRequest) {

    }

    @PatchMapping("/{idAtendimento}")
    public List<AtendimentoResponse> editarUmAtendimento(@RequestBody EditarAtendimentoRequest editarAtendimentoRequest) {

        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/produtos")
    public List<AtendimentoRequest> adicionarProdutos(@PathVariable Integer idAtendimento,
                                                      @RequestBody AdicionarProdutoRequest produtos) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{idAtendimento}/produtos")
    public List<AtendimentoRequest> removerProduto(@PathVariable Integer idAtendimento,
                                                   @RequestBody AdicionarProdutoRequest produtos) {
        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/pagamentos")
    public List<AtendimentoResponse> adicionarPagamentosAUmAtendimento(@PathVariable Integer idAtendimento,
                                                                       @RequestBody PagamentoRequest pagamentos) {
        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/finalizar")
    public void finalizarAtendimento(@PathVariable Integer idAtendimento,
                                     @RequestParam(required = false) Boolean finalizar) {

    }
}
