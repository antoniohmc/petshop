package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.Request.AtendimentoRequest;
import TarefaAvaliativa2.petShop.Request.PagamentoRequest;
import TarefaAvaliativa2.petShop.Request.ProdutosIdRequest;
import TarefaAvaliativa2.petShop.Response.AtendimentoResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public void editarUmAtendimento(@RequestBody AtendimentoRequest atendimentoRequest,
                                    @RequestParam(required = false) Integer valorConsulta) {

    }

    @PostMapping("/{idAtendimento}/produtos")
    public List<AtendimentoRequest> adicionarProdutos(@PathVariable Integer idAtendimento,
                                                      @RequestParam(required = false) ProdutosIdRequest produtos) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{idAtendimento}/produtos")
    public List<AtendimentoRequest> removerProduto(@PathVariable Integer idAtendimento,
                                                   @RequestParam(required = false) ProdutosIdRequest produtos) {
        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/pagamentos")
    public List<AtendimentoResponse> adicionarPagamentosAUmAtendimento(@PathVariable Integer idAtendimento,
                                                                       @RequestParam(required = false) PagamentoRequest pagamentos) {
        return new ArrayList<>();
    }

    @PostMapping("/{idAtendimento}/finalizar")
    public void finalizarAtendimento(@PathVariable Integer idAtendimento,
                                     @RequestParam(required = false) Boolean finalizar) {

    }
}
