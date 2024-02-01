package tarefaavaliativa.petshop.controller.atendimento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
class AtendimentoResponse {

    Integer id;

    String status;

    String nomeAtendente;

    Boolean pagamentoEfetuado;

    LocalDateTime dataAbertura;

    LocalDateTime dataEncerramento;

}
