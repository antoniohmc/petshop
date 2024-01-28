package TarefaAvaliativa2.petshop.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AtendimentoProdutoId implements Serializable {

    @Column(name = "produto_id")
    private Integer produtoId;

    @Column(name = "atendimento_id")
    private Integer atendimentoId;

}
