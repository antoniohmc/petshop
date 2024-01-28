package TarefaAvaliativa2.petshop.controller.cliente;

import TarefaAvaliativa2.petshop.controller.response.EnderecoResponse;
import lombok.*;

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