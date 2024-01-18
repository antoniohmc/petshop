package TarefaAvaliativa2.petShop.request;

import lombok.Data;

import java.util.List;

@Data
public class IniciarAtendimentoRequest {

    private String nomeVeterinario;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private List<ProdutosIdRequest> produtosId;
}
