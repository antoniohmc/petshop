package TarefaAvaliativa2.petshop.controller.atendimento;

import TarefaAvaliativa2.petshop.model.Atendimento;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AtendimentoMapper {

    public static AtendimentoResponse mapToAtendimentoResponse(Atendimento atendimento) {
        return AtendimentoResponse.builder()
                .id(atendimento.getId())
                .dataAbertura(atendimento.getDataAbertura())
                .nomeAtendente(atendimento.getNomeAtendente())
                .pagamentoEfetuado(atendimento.getPagamentoEfetuado())
                .valorConsulta(atendimento.getValorConsulta())
                .idCliente(atendimento.getIdCliente())
                .estado(atendimento.getEstado())
                .nomeVeterinario(atendimento.getNomeVeterinario())
                .dataEncerramento(atendimento.getDataEncerramento())
                .build();
    }
}
