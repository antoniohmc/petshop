package TarefaAvaliativa2.petShop.request;

import TarefaAvaliativa2.petShop.model.FormaPagamento;
import lombok.Data;

@Data
public class AdicionarPagamentoRequest {

    private Integer valorPago;

    private FormaPagamento formaPagamento;
}
