package tarefaavaliativa2.petshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tarefaavaliativa2.petshop.controller.produto.ProdutoMapper;
import tarefaavaliativa2.petshop.controller.produto.ProdutoRequest;
import tarefaavaliativa2.petshop.controller.produto.ProdutoResponse;
import tarefaavaliativa2.petshop.model.Produto;
import tarefaavaliativa2.petshop.service.ProdutoService;

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
