package TarefaAvaliativa2.petshop.controller.produto;

import TarefaAvaliativa2.petshop.model.Produto;
import lombok.Data;

@Data
public class ProdutosIdRequest {

    private Integer id;

    private String nome;

    private Integer valor;

    private String descricao;

    public Produto toModel() {
        return Produto.builder()
                .id(id)
                .nome(nome)
                .descricao(descricao)
                .valor(valor)
                .build();
    }
}
