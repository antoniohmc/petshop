package TarefaAvaliativa2.petShop.controller.atendimento;

import TarefaAvaliativa2.petShop.controller.produto.ProdutoResponse;
import TarefaAvaliativa2.petShop.model.Produto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class AtendimentoResponse {

    private Integer id;

    private LocalDateTime dataAbertura;

    private String nomeAtendente;

    private Boolean pagamentoEfetuado;

    private Integer valorConsulta;

    private Integer idCliente;

    private String estado;

    private String nomeVeterinario;

    private LocalDateTime dataEncerramento;

    private List<ProdutoResponse> produtos;
}
