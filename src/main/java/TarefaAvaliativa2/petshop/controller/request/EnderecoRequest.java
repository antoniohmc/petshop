package tarefaavaliativa2.petshop.controller.request;

import lombok.Data;
import tarefaavaliativa2.petshop.model.Endereco;

@Data
public class EnderecoRequest {
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco toModel() {
        return Endereco.builder()
                .logradouro(logradouro)
                .cidade(cidade)
                .bairro(bairro)
                .numero(numero)
                .estado(estado)
                .build();
    }
}
