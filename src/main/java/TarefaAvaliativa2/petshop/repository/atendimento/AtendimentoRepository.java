package tarefaavaliativa2.petshop.repository.atendimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tarefaavaliativa2.petshop.model.atendimento.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {

}
