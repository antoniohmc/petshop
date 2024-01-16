package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.request.ProdutoRequest;
import TarefaAvaliativa2.petShop.response.ProdutoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse cadastrarProduto(@RequestBody ProdutoRequest produtoRequest) {

        return new ProdutoResponse();
    }

    @PutMapping("/{idProduto}")
    public List<ProdutoResponse> editarProduto(@PathVariable Integer idProduto, @RequestBody ProdutoRequest produtoRequest) {

        return new ArrayList<>();
    }

    @GetMapping()
    public List<ProdutoResponse> listarProdutosCadastrados(@RequestParam(required = false) String nome, @RequestParam(required = false) Integer maiorQue, @RequestParam(required = false) Integer menorQue) {
        return new ArrayList<>();

    }

    @DeleteMapping("/{idProduto}")
    public void deletarProduto(@PathVariable Integer idProduto) {

    }
}
