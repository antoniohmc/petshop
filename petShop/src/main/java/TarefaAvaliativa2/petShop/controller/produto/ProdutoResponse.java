package TarefaAvaliativa2.petShop.controller.produto;

import TarefaAvaliativa2.petShop.model.QuantidadeEstoque;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponse {

    private Integer id;

    private Integer valor;

    private String descricao;

    private Integer quantidadeEstoque;

    private String nome;

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
