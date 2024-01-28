package TarefaAvaliativa2.petshop.controller.produto;

import TarefaAvaliativa2.petshop.model.Produto;
import lombok.Data;

@Data
public class ProdutoRequest {

    private String nome;

    private Integer valor;

    private String descricao;

    public Produto toModel() {
        return Produto.builder()
            .nome(nome)
            .valor(valor)
            .descricao(descricao)
            .build();
    }

}
