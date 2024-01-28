package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.Data;
import tarefaavaliativa2.petshop.model.Atendimento;

@Data
public class EditarAtendimentoRequest {

    private Integer id;

    public Atendimento toModel() {
        return Atendimento.builder()
                .id(id)
                .build();
    }
}
