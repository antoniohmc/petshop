package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.Builder;
import lombok.Data;
import tarefaavaliativa2.petshop.controller.produto.ProdutoResponse;

import java.time.LocalDateTime;
import java.util.Collection;

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

    private Collection<ProdutoResponse> produtos;
}
