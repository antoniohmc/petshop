package tarefaavaliativa2.petshop.controller.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class ClienteRequest {

    String nome;

    String cpf;

    Collection<EnderecoRequest> enderecos;

}
