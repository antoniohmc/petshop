package tarefaavaliativa2.petshop.controller.cliente;

import lombok.Data;
import tarefaavaliativa2.petshop.controller.request.EnderecoRequest;

import java.util.Collection;

@Data
class ClienteRequest {

    private String nome;

    private String cpf;

    private Collection<EnderecoRequest> enderecos;

}
