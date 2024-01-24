package TarefaAvaliativa2.petShop.controller.atendimento;

import TarefaAvaliativa2.petShop.controller.produto.ProdutosIdRequest;
import TarefaAvaliativa2.petShop.model.Atendimento;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IniciarAtendimentoMapper {

    public static IniciarAtendimentoResponse mapToInicarAtendimentoResponse (Atendimento atendimento) {
        return IniciarAtendimentoResponse.builder()
                .nomeVeterinario(atendimento.getNomeVeterinario())
                .nomeAtendente(atendimento.getNomeAtendente())
                .idCliente(atendimento.getId())
                .valorConsulta(atendimento.getValorConsulta())
                .produto((ProdutosIdRequest) atendimento.getProdutos())
                .build();
    }
}
