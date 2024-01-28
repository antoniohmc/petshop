package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.Data;
import tarefaavaliativa2.petshop.controller.produto.ProdutosIdRequest;
import tarefaavaliativa2.petshop.model.Atendimento;

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
