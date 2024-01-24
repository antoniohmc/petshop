package TarefaAvaliativa2.petShop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 6)
    private Integer valor;

    @Column(length = 100)
    private String descricao;

    @Column(length = 50)
    private String nome;

    @OneToOne
    private QuantidadeEstoque quantidadeEstoque;


}
