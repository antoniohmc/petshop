package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.Data;
import tarefaavaliativa2.petshop.model.atendimento.FormaPagamento;

@Data
class AdicionarPagamentoRequest {

    private Integer valorPago;

    private FormaPagamento formaPagamento;
}
