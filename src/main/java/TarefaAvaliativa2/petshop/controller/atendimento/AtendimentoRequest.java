package tarefaavaliativa2.petshop.controller.atendimento;

import tarefaavaliativa2.petshop.model.Produto;

import java.util.Collection;
import java.util.List;

public class AtendimentoRequest {

    private String nomeVeterinaro;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private Collection<Produto> produtos;


}
