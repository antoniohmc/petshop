package TarefaAvaliativa2.petshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.List;
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
public class    Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_abertura")
    private LocalDateTime dataAbertura;

    @Column(name = "nome_Atendente" )
    private String nomeAtendente;

    @Column(name = "pagamento_efetuado")
    private Boolean pagamentoEfetuado;

    private Integer valorConsulta;

    @Column(nullable = false, length = 10)
    private String estado;

    private Integer idCliente;

    @Column(name = "nome_veterinario")
    private String nomeVeterinario;

    @Column(name = "data_encerramento")
    private LocalDateTime dataEncerramento;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Unidade unidade;

    @ManyToOne
    private Pet pets;

    @ManyToMany
    private List<Produto> produtos;

}
