package tarefaavaliativa2.petshop.controller.cliente;

import lombok.Data;
import tarefaavaliativa2.petshop.controller.request.EnderecoRequest;
import tarefaavaliativa2.petshop.model.Cliente;

import java.util.List;

@Data
public class ClienteRequest {

    private String nome;

    private String cpf;

    private EnderecoRequest endereco;

    public Cliente toModel() {
        return Cliente.builder()
                .nome(nome)
                .cpf(cpf)
                .enderecos(List.of(endereco.toModel()))
                .build();
    }
}
