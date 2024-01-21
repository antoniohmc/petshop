package TarefaAvaliativa2.petShop.controller.cliente;

import TarefaAvaliativa2.petShop.controller.request.EnderecoRequest;
import TarefaAvaliativa2.petShop.model.Cliente;
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
