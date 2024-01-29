package tarefaavaliativa2.petshop.controller.cliente;

import lombok.Builder;
import lombok.Data;
import tarefaavaliativa2.petshop.model.cliente.Endereco;

import java.util.Collection;

@Data
@Builder
public class EnderecoResponse {

    private String logradouro;

    private Integer numero;

    private String bairro;

    private String cidade;

    private String estado;

    public static Collection<EnderecoResponse> of(Collection<Endereco> endereco) {
        return endereco.stream()
                .map(EnderecoResponse::of)
                .toList();
    }

    public static EnderecoResponse of(Endereco endereco) {
        return EnderecoResponse.builder()
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .numero(endereco.getNumero())
                .logradouro(endereco.getLogradouro())
                .estado(endereco.getEstado())
                .build();
    }
}