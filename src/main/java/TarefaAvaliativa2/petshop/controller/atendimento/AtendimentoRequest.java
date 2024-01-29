package tarefaavaliativa2.petshop.controller.atendimento;

import tarefaavaliativa2.petshop.model.produto.Produto;

import java.util.Collection;

public class AtendimentoRequest {

    private String nomeVeterinaro;

    private String nomeAtendente;

    private Integer idCliente;

    private Integer valorConsulta;

    private Collection<Produto> produtos;


}
