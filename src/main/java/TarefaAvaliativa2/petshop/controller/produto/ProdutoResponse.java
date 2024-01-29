package tarefaavaliativa2.petshop.controller.produto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class ProdutoResponse {

    Integer id;

    Integer valor;

    String descricao;

    String nome;

    QuantidadeEstoqueResponse quantidadeEstoque;

}
