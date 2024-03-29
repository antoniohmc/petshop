package tarefaavaliativa.petshop.model.atendimento;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

    @ManyToOne
    Atendimento atendimento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer valor;

    private LocalDateTime dataPagamento;

    private FormaPagamento formaPagamento;

}
