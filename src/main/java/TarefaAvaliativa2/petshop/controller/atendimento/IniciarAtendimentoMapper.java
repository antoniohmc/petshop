package tarefaavaliativa2.petshop.controller.atendimento;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa2.petshop.controller.produto.ProdutosIdRequest;
import tarefaavaliativa2.petshop.model.Atendimento;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IniciarAtendimentoMapper {

    public static IniciarAtendimentoResponse mapToInicarAtendimentoResponse(Atendimento atendimento) {
        return IniciarAtendimentoResponse.builder()
                .nomeVeterinario(atendimento.getNomeVeterinario())
                .nomeAtendente(atendimento.getNomeAtendente())
                .idCliente(atendimento.getId())
                .valorConsulta(atendimento.getValorConsulta())
                .produto((ProdutosIdRequest) atendimento.getProdutos())
                .build();
    }
}
