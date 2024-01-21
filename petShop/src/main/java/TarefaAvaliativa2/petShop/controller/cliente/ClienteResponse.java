package TarefaAvaliativa2.petShop.controller.cliente;

import TarefaAvaliativa2.petShop.controller.response.EnderecoResponse;
import TarefaAvaliativa2.petShop.model.Cliente;
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