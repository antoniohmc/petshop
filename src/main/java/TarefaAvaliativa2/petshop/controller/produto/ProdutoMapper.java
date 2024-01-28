package tarefaavaliativa2.petshop.controller.produto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.model.Produto;

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
