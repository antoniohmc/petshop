package TarefaAvaliativa2.petshop.controller.request;

import TarefaAvaliativa2.petshop.model.FormaPagamento;
import lombok.Data;

@Data
public class AdicionarPagamentoRequest {

    private Integer valorPago;

    private FormaPagamento formaPagamento;
}
