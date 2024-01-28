package TarefaAvaliativa2.petshop.controller.atendimento;

import TarefaAvaliativa2.petshop.controller.produto.ProdutosIdRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IniciarAtendimentoResponse {

    private String nomeVeterinario;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private ProdutosIdRequest produto;
}
