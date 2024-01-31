package tarefaavaliativa2.petshop.model.atendimento;

import lombok.AllArgsConstructor;

import java.util.Arrays;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public enum SituacaoAtendimento {

    EM_ABERTO,
    FINALIZADO;

}
