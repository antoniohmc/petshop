package tarefaavaliativa.petshop.repository.atendimento;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class AtendimentoPersistenceService {

    private final AtendimentoRepository atendimentoRepository;

    public Atendimento iniciar(Atendimento atendimento) {

        return atendimentoRepository.save(atendimento);
    }

    public Collection<Atendimento> buscarAtendimentos() {

        return atendimentoRepository.findAll();
    }

    public Atendimento buscarPorId(Integer id) {
        return atendimentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Atendimento não encontrado, digite um id válido"));
    }

    public Atendimento atualizar(Atendimento atendimento) {

        return atendimentoRepository.saveAndFlush(atendimento);
    }
}
