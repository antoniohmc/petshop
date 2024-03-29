package tarefaavaliativa.petshop.service.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa.petshop.model.cliente.Cliente;
import tarefaavaliativa.petshop.repository.cliente.ClientePersistenceService;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClientePersistenceService clientePersistenceService;

    public Cliente criar(Cliente cliente) {

        return clientePersistenceService.criar(cliente);
    }

    public Collection<Cliente> buscarClientes() {

        return clientePersistenceService.buscarClientes();
    }

    public Cliente buscarPorId(Integer id) {

        return clientePersistenceService.buscarPorId(id);
    }

    public void excluirPorId(Integer id) {

        clientePersistenceService.excluirPorId(id);
    }

    public Cliente atualizar(Integer id, Cliente cliente) {

        Cliente existente = clientePersistenceService.buscarPorId(id);

        Cliente atualizado = Cliente.builder()
                .id(existente.getId())
                .cpf(cliente.getCpf())
                .nome(cliente.getNome())
                .enderecos(cliente.getEnderecos())
                .build();

        return clientePersistenceService.atualizar(atualizado);
    }
}
