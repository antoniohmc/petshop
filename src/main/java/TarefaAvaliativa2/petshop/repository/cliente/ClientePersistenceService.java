package tarefaavaliativa2.petshop.repository.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tarefaavaliativa2.petshop.model.cliente.Cliente;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class ClientePersistenceService {

    private final ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    public Collection<Cliente> listarClientes() {

        return clienteRepository.findAll();
    }

    public void excluirCliente(Integer id) {

        clienteRepository.deleteById(id);
    }

    public Cliente buscarPorId(Integer id) {

        return clienteRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum cliente encontrado para o id informado: " + id));
    }

    public Cliente atualizarCliente(Cliente cliente) {

        return clienteRepository.saveAndFlush(cliente);
    }

}
