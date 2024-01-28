package TarefaAvaliativa2.petshop.controller.cliente;

import TarefaAvaliativa2.petshop.controller.request.EnderecoRequest;
import TarefaAvaliativa2.petshop.model.Cliente;
import lombok.Data;

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
