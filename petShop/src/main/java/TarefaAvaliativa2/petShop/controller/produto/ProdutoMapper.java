package TarefaAvaliativa2.petShop.controller.produto;

import TarefaAvaliativa2.petShop.model.Produto;
import TarefaAvaliativa2.petShop.model.QuantidadeEstoque;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProdutoMapper {

    public static ProdutoResponse mapToProdutoResponse(Produto produto) {

        return ProdutoResponse.builder()
            .valor(produto.getValor())
            .descricao(produto.getDescricao())
            .nome(produto.getNome())
            .build();
    }

}
