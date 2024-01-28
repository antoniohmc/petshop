package TarefaAvaliativa2.petshop.controller.atendimento;

import TarefaAvaliativa2.petshop.model.Atendimento;
import lombok.Data;

@Data
public class EditarAtendimentoRequest {

    private Integer id;

    public Atendimento toModel() {
        return Atendimento.builder()
                .id(id)
                .build();
    }
}
