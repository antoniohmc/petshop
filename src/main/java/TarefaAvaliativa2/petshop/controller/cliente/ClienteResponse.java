package tarefaavaliativa2.petshop.controller.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class ClienteResponse {

    private Integer id;

    private String cpf;

    private String nome;

    private Collection<EnderecoResponse> enderecos;

}