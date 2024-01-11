package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.Request.ProdutoRequest;
import TarefaAvaliativa2.petShop.Response.ProdutoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private void cadastrarProduto(@RequestBody ProdutoRequest produtoRequest) {

    }

    @PutMapping("/{idProduto}")
    private void editarProduto(@PathVariable Integer idProduto, @RequestBody ProdutoRequest produtoRequest) {

    }

    @GetMapping()
    private List<ProdutoResponse> listarProdutosCadastrados(@RequestParam(required = false) String nome, @RequestParam(required = false) Integer maiorQue, @RequestParam(required = false) Integer menorQue) {
        return new ArrayList<>();

    }

    @DeleteMapping("/{idProduto}")
    private void deletarProduto(@PathVariable Integer idProduto) {

    }
}
