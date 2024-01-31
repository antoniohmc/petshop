package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class AtendimentoProdutoRequest {

    Integer quantidade;

    Integer produtoId;
}
