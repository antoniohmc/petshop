package tarefaavaliativa2.petshop.controller.produto;

import lombok.Data;
import tarefaavaliativa2.petshop.model.Produto;

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
