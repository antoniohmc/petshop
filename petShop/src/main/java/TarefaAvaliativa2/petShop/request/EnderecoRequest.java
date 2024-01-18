package TarefaAvaliativa2.petShop.request;

import TarefaAvaliativa2.petShop.model.Endereco;
import lombok.Data;

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
                .build();
    }
}
