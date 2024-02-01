package tarefaavaliativa.petshop.controller.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class EnderecoResponse {

    String logradouro;

    Integer numero;

    String bairro;

    String cidade;

    String estado;

}