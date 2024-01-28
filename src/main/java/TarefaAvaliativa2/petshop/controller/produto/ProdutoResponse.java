package TarefaAvaliativa2.petshop.controller.produto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponse {

    private Integer valor;

    private String descricao;

    private String nome;

}
