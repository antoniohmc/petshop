package TarefaAvaliativa2.petShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.math.BigInteger;
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
@Table(name = "quantidade_estoque")
public class QuantidadeEstoque {

    @Column(name = "quantidade_atual")
    private BigInteger quantidadeAtual;

}
