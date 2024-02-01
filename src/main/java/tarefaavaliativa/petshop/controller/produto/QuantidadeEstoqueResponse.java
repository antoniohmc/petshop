package tarefaavaliativa.petshop.controller.produto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class QuantidadeEstoqueResponse {

    Integer id;

    BigInteger quantidadeAtual;
}
