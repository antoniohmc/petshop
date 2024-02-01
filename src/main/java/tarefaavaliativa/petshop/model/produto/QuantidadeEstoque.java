package tarefaavaliativa.petshop.model.produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigInteger;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Builder
@NoArgsConstructor
@Table(name = "quantidade_estoque")
@AllArgsConstructor(access = PRIVATE)
public class QuantidadeEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "quantidade_atual")
    private BigInteger quantidadeAtual;


}
