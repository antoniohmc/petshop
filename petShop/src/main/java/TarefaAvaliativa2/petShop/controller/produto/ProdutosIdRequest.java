package TarefaAvaliativa2.petShop.controller.produto;

import TarefaAvaliativa2.petShop.model.Endereco;
import TarefaAvaliativa2.petShop.model.Produto;
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
