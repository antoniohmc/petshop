package tarefaavaliativa.petshop.repository.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tarefaavaliativa.petshop.model.cliente.Cliente;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class ClientePersistenceService {

    private final ClienteRepository clienteRepository;

    public Cliente criar(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    public Collection<Cliente> buscarClientes() {

        return clienteRepository.findAll();
    }

    public void excluirPorId(Integer id) {

        clienteRepository.deleteById(id);
    }

    public Cliente buscarPorId(Integer id) {

        return clienteRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum cliente encontrado para o id informado: " + id));
    }

    public Cliente atualizar(Cliente cliente) {

        return clienteRepository.saveAndFlush(cliente);
    }

}
