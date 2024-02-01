package tarefaavaliativa2.petshop.model.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String cpf;

    private String nome;

    @OneToMany(cascade = ALL, orphanRemoval = true)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Collection<Endereco> enderecos;

}
