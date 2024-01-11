package TarefaAvaliativa2.petShop.Request;

import TarefaAvaliativa2.petShop.model.Endereco;
import lombok.Data;

@Data
public class ClienteRequest {

    private String nome;

    private String cpf;

    private Endereco endereco;
}
