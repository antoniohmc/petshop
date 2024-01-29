package tarefaavaliativa2.petshop.controller.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class ClienteResponse {

    Integer id;

    String cpf;

    String nome;

    Collection<EnderecoResponse> enderecos;

}