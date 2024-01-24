package TarefaAvaliativa2.petShop.controller.atendimento;

import TarefaAvaliativa2.petShop.controller.produto.ProdutosIdRequest;
import TarefaAvaliativa2.petShop.model.Atendimento;
import lombok.Data;

import java.util.List;

@Data
public class IniciarAtendimentoRequest {

    private String nomeVeterinario;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private ProdutosIdRequest produto;

    public Atendimento toModel() {
        return Atendimento.builder()
                .nomeVeterinario(nomeVeterinario)
                .nomeVeterinario(nomeVeterinario)
                .idCliente(idCliente)
                .valorConsulta(valorConsulta)
                .produtos(List.of(produto.toModel()))
                .build();
    }
}
