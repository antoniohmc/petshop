package TarefaAvaliativa2.petShop.Response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AtendimentoResponse {
    private Integer id;

    private LocalDateTime dataAbertura;

    private String nomeAtendente;

    private Boolean pagamentoEfetuado;

    private Float valorConsulta;

    private String estado;

    private String nomeVeterinario;

    private LocalDateTime dataEncerramento;
}
