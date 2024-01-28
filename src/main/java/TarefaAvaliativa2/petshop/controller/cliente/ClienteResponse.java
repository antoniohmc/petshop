package tarefaavaliativa2.petshop.controller.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.controller.response.EnderecoResponse;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponse {

    private Integer id;

    private String nome;

    private String cpf;

    private List<EnderecoResponse> endereco;

}