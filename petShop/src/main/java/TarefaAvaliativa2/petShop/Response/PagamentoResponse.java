package TarefaAvaliativa2.petShop.Response;

import TarefaAvaliativa2.petShop.model.FormaPagamento;

import java.time.LocalDateTime;

public class PagamentoResponse {

    private Integer id;

    private Integer valor;

    private LocalDateTime dataPagamento;

    private FormaPagamento formaPagamento;
}
