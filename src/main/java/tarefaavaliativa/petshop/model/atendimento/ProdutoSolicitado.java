package tarefaavaliativa.petshop.model.atendimento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class ProdutoSolicitado {

    Integer quantidade;

    Integer produtoId;
}
