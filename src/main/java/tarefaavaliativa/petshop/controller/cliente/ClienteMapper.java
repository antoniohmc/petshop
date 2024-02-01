package tarefaavaliativa.petshop.controller.cliente;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa.petshop.model.cliente.Cliente;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class ClienteMapper {

    static ClienteResponse mapToClienteResponse(Cliente cliente) {

        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .enderecos(EnderecoMapper.mapToEnderecoResponse(cliente.getEnderecos()))
                .build();
    }

    static Cliente mapToCliente(ClienteRequest request) {

        return Cliente.builder()
                .nome(request.getNome())
                .cpf(request.getCpf())
                .enderecos(EnderecoMapper.mapToEndereco(request.getEnderecos()))
                .build();
    }

}
