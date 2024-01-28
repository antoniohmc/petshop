package TarefaAvaliativa2.petshop.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "quantidade_estoque")
public class QuantidadeEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "quantidade_atual")
    private BigInteger quantidadeAtual;


}
