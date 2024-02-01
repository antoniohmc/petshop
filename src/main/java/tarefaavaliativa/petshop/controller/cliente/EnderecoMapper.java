package tarefaavaliativa.petshop.controller.cliente;

import lombok.NoArgsConstructor;
import tarefaavaliativa.petshop.model.cliente.Endereco;

import java.util.Collection;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
class EnderecoMapper {

    static Collection<Endereco> mapToEndereco(Collection<EnderecoRequest> requests) {

        return requests.stream()
                .map(EnderecoMapper::mapToEndereco)
                .toList();
    }

    private static Endereco mapToEndereco(EnderecoRequest request) {

        return Endereco
                .builder()
                .cidade(request.getCidade())
                .estado(request.getEstado())
                .numero(request.getNumero())
                .bairro(request.getBairro())
                .logradouro(request.getLogradouro())
                .build();
    }

    static Collection<EnderecoResponse> mapToEnderecoResponse(Collection<Endereco> enderecos) {

        return enderecos.stream()
                .map(EnderecoMapper::mapToEnderecoResponse)
                .toList();
    }

    private static EnderecoResponse mapToEnderecoResponse(Endereco endereco) {

        return EnderecoResponse.builder()
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .numero(endereco.getNumero())
                .bairro(endereco.getBairro())
                .logradouro(endereco.getLogradouro())
                .build();

    }
}
