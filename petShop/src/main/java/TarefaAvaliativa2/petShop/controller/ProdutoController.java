package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.controller.produto.ProdutoMapper;
import TarefaAvaliativa2.petShop.controller.produto.ProdutoRequest;
import TarefaAvaliativa2.petShop.controller.produto.ProdutoResponse;
import TarefaAvaliativa2.petShop.model.Produto;
import TarefaAvaliativa2.petShop.service.ProdutoService;
import java.util.List;
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

        return ProdutoMapper.mapToProdutoResponse(salvo);
    }

    @PutMapping(path = "/{idProduto}")
    public ProdutoResponse editarProduto(@PathVariable Integer idProduto, @RequestBody ProdutoRequest produtoRequest) {

        return ProdutoMapper.mapToProdutoResponse(
            produtoService.editarProduto(idProduto, produtoRequest.toModel())
        );
    }


    @GetMapping
    public List<ProdutoResponse> listarProdutos(
        @RequestParam(required = false) String nome,
        @RequestParam(required = false) Integer precoMaiorQue,
        @RequestParam(required = false) Integer precoMenorQue
    ) {
        return produtoService.listarProdutos()
            .stream()
            .map(ProdutoMapper::mapToProdutoResponse)
            .toList();
    }

    @DeleteMapping("/{idProduto}")
    public ProdutoResponse deletarProduto(@PathVariable Integer idProduto, @RequestBody ProdutoRequest produtoRequest) {

        Produto model = produtoRequest.toModel();
        Produto deletado = produtoService.deletarProduto(model);

        return ProdutoMapper.mapToProdutoResponse(deletado);

    }
}
