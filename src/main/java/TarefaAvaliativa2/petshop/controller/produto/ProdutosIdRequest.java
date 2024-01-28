package tarefaavaliativa2.petshop.controller.produto;

import lombok.Data;
import tarefaavaliativa2.petshop.model.Produto;

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
