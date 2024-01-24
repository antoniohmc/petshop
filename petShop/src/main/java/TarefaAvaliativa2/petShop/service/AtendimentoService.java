package TarefaAvaliativa2.petShop.service;

import TarefaAvaliativa2.petShop.model.Atendimento;
import TarefaAvaliativa2.petShop.repository.AtendimentoRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    private final AtendimentoRepositoryService atendimentoRepository;

    public Atendimento iniciarAtendimento(Atendimento atendimento) {
        return atendimentoRepository.iniciarAtendimento(atendimento);
    }

    public Collection<Atendimento> listarAtendimentos() {
        return atendimentoRepository.listarAtendimentos();
    }

    public Atendimento editarAtendimento(Atendimento atendimento, Integer id) {
        Atendimento iniciado = atendimentoRepository.buscarPorId(id);

        iniciado.setValorConsulta(atendimento.getValorConsulta());

        return atendimentoRepository.atualizar(iniciado);
    }
}
