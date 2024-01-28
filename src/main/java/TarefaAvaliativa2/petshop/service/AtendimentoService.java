package tarefaavaliativa2.petshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.Atendimento;
import tarefaavaliativa2.petshop.repository.AtendimentoRepositoryService;

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
