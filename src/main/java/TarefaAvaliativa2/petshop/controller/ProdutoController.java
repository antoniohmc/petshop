package TarefaAvaliativa2.petshop.controller;

import TarefaAvaliativa2.petshop.controller.produto.ProdutoMapper;
import TarefaAvaliativa2.petshop.controller.produto.ProdutoRequest;
import TarefaAvaliativa2.petshop.controller.produto.ProdutoResponse;
import TarefaAvaliativa2.petshop.model.Produto;
import TarefaAvaliativa2.petshop.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse criarProduto(@RequestBody ProdutoRequest produtoRequest) {

        Produto model = produtoRequest.toModel();
        Produto salvo = produtoService.criarNovoProduto(model);

        return ProdutoMapper
                .mapToProdutoResponse(salvo);
    }

    @PutMapping(path = "/{idProduto}")
    public ProdutoResponse editarProduto(@PathVariable Integer idProduto,
                                         @RequestBody ProdutoRequest produtoRequest) {

        return ProdutoMapper
                .mapToProdutoResponse(produtoService.editarProduto(idProduto, produtoRequest.toModel()));
    }


    @GetMapping
    public List<ProdutoResponse> listarProdutos(@RequestParam(required = false) String nome,
                                                @RequestParam(required = false) Integer precoMaiorQue,
                                                @RequestParam(required = false) Integer precoMenorQue) {

        return produtoService.listarProdutos()
                .stream()
                .map(ProdutoMapper::mapToProdutoResponse)
                .toList();
    }

    @DeleteMapping("/{idProduto}")
    public void deletarProduto(@PathVariable Integer idProduto) {
        produtoService.deletarProduto(idProduto);
    }
}
