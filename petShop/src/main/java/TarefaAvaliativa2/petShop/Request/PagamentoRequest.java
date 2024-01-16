package TarefaAvaliativa2.petShop.Request;

import TarefaAvaliativa2.petShop.model.FormaPagamento;
import lombok.Data;

@Data
public class PagamentoRequest {

    private Integer valor;

    private FormaPagamento formaPagamento;
}
