package tarefaavaliativa2.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tarefaavaliativa2.petshop.model.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {
}
