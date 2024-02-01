package tarefaavaliativa.petshop.controller.atendimento;

import lombok.Data;
import tarefaavaliativa.petshop.model.atendimento.FormaPagamento;

@Data
class AdicionarPagamentoRequest {

    private Integer valorPago;

    private FormaPagamento formaPagamento;
}
