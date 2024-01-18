package TarefaAvaliativa2.petShop.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

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
}
