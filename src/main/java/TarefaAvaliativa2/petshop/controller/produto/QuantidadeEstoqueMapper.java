package tarefaavaliativa2.petshop.controller.produto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.model.produto.QuantidadeEstoque;

import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class QuantidadeEstoqueMapper {

    static QuantidadeEstoque mapToQuantidadeEstoque(BigInteger quantidade) {

        return QuantidadeEstoque.builder()
                .quantidadeAtual(quantidade)
                .build();
    }

    static QuantidadeEstoqueResponse maptoQuantidadeEstoqueResponse(QuantidadeEstoque quantidadeEstoque) {

        return QuantidadeEstoqueResponse.builder()
                .id(quantidadeEstoque.getId())
                .quantidadeAtual(quantidadeEstoque.getQuantidadeAtual())
                .build();
    }

}
