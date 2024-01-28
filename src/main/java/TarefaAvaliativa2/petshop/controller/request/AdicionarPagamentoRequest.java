package tarefaavaliativa2.petshop.controller.request;

import lombok.Data;
import tarefaavaliativa2.petshop.model.FormaPagamento;

@Data
public class AdicionarPagamentoRequest {

    private Integer valorPago;

    private FormaPagamento formaPagamento;
}
