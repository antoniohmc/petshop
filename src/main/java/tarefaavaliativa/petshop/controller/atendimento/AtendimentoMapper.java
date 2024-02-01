package tarefaavaliativa.petshop.controller.atendimento;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;
import tarefaavaliativa.petshop.model.atendimento.ProdutoSolicitado;

import java.time.LocalDateTime;
import java.util.Collection;

import static java.lang.Boolean.FALSE;
import static tarefaavaliativa.petshop.model.atendimento.SituacaoAtendimento.EM_ABERTO;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class AtendimentoMapper {

    static Atendimento mapToAtendimento(AtendimentoRequest request) {

        return Atendimento.builder()
                .status(EM_ABERTO)
                .pagamentoEfetuado(FALSE)
                .dataAbertura(LocalDateTime.now())
                .nomeAtendente(request.getNomeAtendente())
                .build();
    }

    static Collection<ProdutoSolicitado> mapToProdutosSolicitados(Collection<AtendimentoProdutoRequest> requests) {

        return requests.stream()
                .map(AtendimentoMapper::mapToProdutoSolicitado)
                .toList();
    }

    private static ProdutoSolicitado mapToProdutoSolicitado(AtendimentoProdutoRequest request) {

        return ProdutoSolicitado.builder()
                .produtoId(request.getProdutoId())
                .quantidade(request.getQuantidade())
                .build();
    }

    static AtendimentoResponse mapToAtendimentoResponse(Atendimento atendimento) {

        return AtendimentoResponse.builder()
                .id(atendimento.getId())
                .status(atendimento.getStatus().name())
                .dataAbertura(atendimento.getDataAbertura())
                .nomeAtendente(atendimento.getNomeAtendente())
                .dataEncerramento(atendimento.getDataEncerramento())
                .pagamentoEfetuado(atendimento.isPagamentoEfetuado())
                .build();
    }
}
