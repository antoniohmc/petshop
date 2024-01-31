package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class AdicionarProdutoAtendimentoRequest {

    Collection<Integer> produtosId;

}
