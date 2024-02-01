package tarefaavaliativa.petshop.repository.atendimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tarefaavaliativa.petshop.model.atendimento.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {

}
