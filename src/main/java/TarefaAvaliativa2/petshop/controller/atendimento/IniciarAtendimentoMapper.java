package TarefaAvaliativa2.petshop.controller.atendimento;

import TarefaAvaliativa2.petshop.controller.produto.ProdutosIdRequest;
import TarefaAvaliativa2.petshop.model.Atendimento;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

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
