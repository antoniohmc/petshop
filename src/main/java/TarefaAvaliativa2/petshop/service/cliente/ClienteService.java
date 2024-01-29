package tarefaavaliativa2.petshop.service.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.cliente.Cliente;
import tarefaavaliativa2.petshop.repository.cliente.ClientePersistenceService;
import tarefaavaliativa2.petshop.repository.cliente.ClienteRepository;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClientePersistenceService clientePersistenceService;

    public Cliente criarCliente(Cliente cliente) {

        return clientePersistenceService.criarCliente(cliente);
    }


    public Collection<Cliente> listaDeClientes() {

        return clientePersistenceService.listarClientes();
    }

    public void deletarCliente(Integer id) {

        clientePersistenceService.excluirCliente(id);
    }

    public Cliente atualizarCliente(Integer id, Cliente cliente) {

        Cliente clienteExistente = clientePersistenceService.buscarPorId(id);

        Cliente clienteAtualizado = Cliente.builder()
                .id(clienteExistente.getId())
                .cpf(cliente.getCpf())
                .nome(cliente.getNome())
                .enderecos(cliente.getEnderecos())
                .build();

        return clientePersistenceService.atualizarCliente(clienteAtualizado);
    }
}
