package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.Request.AtendimentoRequest;
import TarefaAvaliativa2.petShop.Request.PagamentoRequest;
import TarefaAvaliativa2.petShop.Request.ProdutosIdRequest;
import TarefaAvaliativa2.petShop.Response.AtendimentoResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/atendimentos")
public class AtendimentoController {

    @GetMapping()
    private List<AtendimentoResponse> listarAtendimentos(@RequestParam(required = false) Boolean estado,
                                                         @RequestParam(required = false) List<AtendimentoRequest> sort,
                                                         @RequestParam(required = false) List<AtendimentoResponse> sort2,
                                                         @RequestParam(required = false) LocalDateTime dataAberturaInicio,
                                                         @RequestParam(required = false) LocalDateTime dataAberturaFim,
                                                         @RequestParam(required = false) LocalDateTime DataEncerramentoInicio,
                                                         @RequestParam(required = false) LocalDateTime dataEncerramentoInicio,
                                                         @RequestParam(required = false) LocalDateTime dataEncerramentoFim) {
        return new ArrayList<>();
    }

    @PostMapping()
    private void iniciarAtendimento(@RequestBody AtendimentoRequest atendimentoRequest) {

    }

    @PatchMapping("/{idAtendimento}")
    private void editarUmAtendimento(@RequestBody AtendimentoRequest atendimentoRequest, @PathVariable Integer valorConsulta) {

    }

    @PostMapping("/{idAtendimento}/produtos")
    private List<AtendimentoRequest> adicionarProdutos(@PathVariable Integer idAtendimento,
                                                       @RequestParam(required = false) ProdutosIdRequest produtos) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{idAtendimento}/produtos")
    private List<AtendimentoRequest> removerProduto(@PathVariable Integer idAtendimento,
                                                    @RequestParam(required = false) ProdutosIdRequest produtos) {
        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/pagamentos")
    private void adicionarPagamentoAUmAtendimento(@PathVariable Integer id,
                                                  @RequestParam(required = false) PagamentoRequest pagamentos) {
    }

    @PostMapping("/{idAtendimento}/finalizar")
    private void finalizarAtendimento(@PathVariable Integer id,
                                      @PathVariable Boolean finalizar ) {

    }
}
