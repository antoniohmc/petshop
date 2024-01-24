package TarefaAvaliativa2.petShop.controller.atendimento;

import TarefaAvaliativa2.petShop.model.Atendimento;
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
