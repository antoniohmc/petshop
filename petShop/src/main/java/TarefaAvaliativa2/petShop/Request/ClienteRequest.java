package TarefaAvaliativa2.petShop.Request;

import TarefaAvaliativa2.petShop.model.Endereco;
import lombok.Data;

import java.util.List;

@Data
public class ClienteRequest {

    private String nome;

    private String cpf;

    private List<Endereco> endereco;
}
