package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.Builder;
import lombok.Data;
import tarefaavaliativa2.petshop.controller.produto.ProdutosIdRequest;

@Data
@Builder
public class IniciarAtendimentoResponse {

    private String nomeVeterinario;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private ProdutosIdRequest produto;
}
