package tarefaavaliativa2.petshop.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tarefaavaliativa2.petshop.model.Atendimento;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class AtendimentoRepositoryService {
    private final AtendimentoRepository atendimentoRepository;

    public Atendimento iniciarAtendimento(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);

    }

    public Collection<Atendimento> listarAtendimentos() {
        return atendimentoRepository.findAll();
    }


    public Atendimento buscarPorId(Integer id) {
        return atendimentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Atendimento não encontrado, digite um id válido"));
    }

    public Atendimento atualizar(Atendimento atendimento) {
        return iniciarAtendimento(atendimento);
    }
}
