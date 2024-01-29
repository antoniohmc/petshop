package tarefaavaliativa2.petshop.controller.produto;

import lombok.RequiredArgsConstructor;
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
import tarefaavaliativa2.petshop.model.produto.Produto;
import tarefaavaliativa2.petshop.service.produto.ProdutoService;

import java.util.Collection;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/produtos")
class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(CREATED)
    ProdutoResponse criar(@RequestBody ProdutoRequest request) {

        Produto produto = ProdutoMapper.mapToProduto(request);
        Produto salvo = produtoService.criar(produto);

        return ProdutoMapper.mapToProdutoResponse(salvo);
    }

    @ResponseStatus(OK)
    @PutMapping(path = "/{id}")
    ProdutoResponse atualizar(@PathVariable Integer id, @RequestBody ProdutoRequest request) {

        Produto produto = ProdutoMapper.mapToProduto(request);
        Produto atualizado = produtoService.atualizar(id, produto);

        return ProdutoMapper.mapToProdutoResponse(atualizado);
    }


    @GetMapping
    @ResponseStatus(OK)
    Collection<ProdutoResponse> buscarProdutos(@RequestParam(required = false) String nome,
                                               @RequestParam(required = false) Integer valorMenorQue,
                                               @RequestParam(required = false) Integer valorMaiorQue) {

        return produtoService.buscarProdutos(nome, valorMenorQue, valorMaiorQue)
                .stream()
                .map(ProdutoMapper::mapToProdutoResponse)
                .toList();
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping("/{id}")
    void excluir(@PathVariable Integer id) {

        produtoService.excluir(id);
    }
}
