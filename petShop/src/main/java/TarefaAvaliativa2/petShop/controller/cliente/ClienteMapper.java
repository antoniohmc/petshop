package TarefaAvaliativa2.petShop.controller.cliente;

import TarefaAvaliativa2.petShop.controller.response.EnderecoResponse;
import TarefaAvaliativa2.petShop.model.Cliente;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static ClienteResponse mapToClienteResponse(Cliente cliente) {

        return ClienteResponse.builder()
            .id(cliente.getId())
            .nome(cliente.getNome())
            .cpf(cliente.getCpf())
            .endereco(
                EnderecoResponse.of(cliente.getEnderecos())
            )
            .build();
    }

}
