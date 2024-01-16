package TarefaAvaliativa2.petShop.Request;

import lombok.Data;

@Data
public class AtendimentoRequest {

    private String nomeVeterinario;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private ProdutosIdRequest produtosId;
}
