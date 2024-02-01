package tarefaavaliativa.petshop.controller.produto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class ProdutosIdRequest {

    Integer id;

    String nome;

    Integer valor;

    String descricao;

}
