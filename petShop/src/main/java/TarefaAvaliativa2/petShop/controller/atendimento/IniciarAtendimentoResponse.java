package TarefaAvaliativa2.petShop.controller.atendimento;

import TarefaAvaliativa2.petShop.controller.produto.ProdutosIdRequest;
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
