package tarefaavaliativa2.petshop.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class EnderecoRequest {

    String bairro;

    String cidade;

    String estado;

    Integer numero;

    String logradouro;
}
