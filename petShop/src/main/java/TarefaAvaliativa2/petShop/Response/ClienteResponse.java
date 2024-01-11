package TarefaAvaliativa2.petShop.Response;

import TarefaAvaliativa2.petShop.model.Endereco;
import lombok.*;

import java.util.List;

@Data
public class ClienteResponse {

    private Integer id;

    private String nome;

    private String cpf;

    private List<Endereco> enderecos;
}
