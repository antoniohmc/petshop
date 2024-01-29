package tarefaavaliativa2.petshop.controller.produto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.model.produto.Produto;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class ProdutoMapper {

    static ProdutoResponse mapToProdutoResponse(Produto produto) {

        return ProdutoResponse.builder()
                .id(produto.getId())
                .valor(produto.getValor())
                .descricao(produto.getDescricao())
                .nome(produto.getNome())
                .quantidadeEstoque(QuantidadeEstoqueMapper.maptoQuantidadeEstoqueResponse(produto.getQuantidadeEstoque()))
                .build();
    }

    static Produto mapToProduto(ProdutoRequest request) {

        return Produto.builder()
                .valor(request.getValor())
                .descricao(request.getDescricao())
                .nome(request.getNome())
                .quantidadeEstoque(QuantidadeEstoqueMapper.mapToQuantidadeEstoque(request.getQuantidadeEstoque()))
                .build();
    }

}
