package tarefaavaliativa2.petshop.model.atendimento;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tarefaavaliativa2.petshop.model.cliente.Cliente;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class Atendimento {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "data_abertura")
    private LocalDateTime dataAbertura;

    @Column(name = "nome_Atendente")
    private String nomeAtendente;

    @Column(name = "pagamento_efetuado")
    private boolean pagamentoEfetuado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private SituacaoAtendimento status;

    @Column(name = "data_encerramento")
    private LocalDateTime dataEncerramento;

    @ManyToOne
    private Cliente cliente;

    @Builder.Default
    @OneToMany(mappedBy = "atendimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<AtendimentoProduto> produtos = Collections.emptyList();

    public void adicionarProdutos(Collection<AtendimentoProduto> produtos) {

        this.produtos = produtos;
    }

    public void adicionarCliente(Cliente cliente) {

        this.cliente = cliente;
    }
}
