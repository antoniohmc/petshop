package tarefaavaliativa.petshop.controller.atendimento;

import lombok.Data;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;

@Data
class EditarAtendimentoRequest {

    private Integer id;

    public Atendimento toModel() {
        return Atendimento.builder()
                .id(id)
                .build();
    }
}
