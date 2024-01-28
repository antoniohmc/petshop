package TarefaAvaliativa2.petshop.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class Mamifero extends TipoAnimal {

    private String raca;

    private Boolean possuiPelos;


}
