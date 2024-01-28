package tarefaavaliativa2.petshop.controller.cliente;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.controller.response.EnderecoResponse;
import tarefaavaliativa2.petshop.model.Cliente;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static ClienteResponse mapToClienteResponse(Cliente cliente) {

        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .endereco(EnderecoResponse.of(cliente.getEnderecos()))
                .build();
    }

}
