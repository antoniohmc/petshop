package TarefaAvaliativa2.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AtendimentoProduto {
    @EmbeddedId
    private AtendimentoProdutoId id;

    @ManyToOne
    @MapsId("produto_id")
    @JoinColumn(name = "produto_id", referencedColumnName = "id")
    private Produto produto;

    @ManyToOne
    @MapsId("atendimento_id")
    @JoinColumn(name = "atendimento_id", referencedColumnName = "id")
    private Atendimento atendimento;

    @Column(nullable = false)
    private LocalDateTime dataEntrada;

    @Column(nullable = false)
    private Integer quantidade;

}