package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.controller.request.ProdutoRequest;
import TarefaAvaliativa2.petShop.controller.response.ProdutoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse criarProduto(@RequestBody ProdutoRequest produtoRequest) {

        return new ProdutoResponse();
    }

    @PutMapping(path = "/{idProduto}")
    public ProdutoResponse editarProduto(@PathVariable Long idProduto) {
        return ProdutoResponse.builder()
                .id(1)
                .nome("Teste Edit")
                .descricao("descricao")
                .quantidadeEstoque(0)
                .valor(12000)
                .build();
    }



    @GetMapping
    public List<ProdutoResponse> listarProdutos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Integer precoMaiorQue,
            @RequestParam(required = false) Integer precoMenorQue
    ) {
        return List.of(
                ProdutoResponse.builder()
                        .id(1)
                        .nome("Teste")
                        .descricao("descricao")
                        .quantidadeEstoque(0)
                        .valor(12000)
                        .build()
        );
    }

    @DeleteMapping("/{idProduto}")
    public void deletarProduto(@PathVariable Integer idProduto) {

    }
}
