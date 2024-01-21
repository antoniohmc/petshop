package TarefaAvaliativa2.petShop.service;

import TarefaAvaliativa2.petShop.model.Cliente;
import TarefaAvaliativa2.petShop.repository.ClienteRepositoryImpl;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepositoryImpl clienteRepository;


    public Cliente criarNovo(Cliente cliente) {
        return clienteRepository.criarNovo(cliente);
    }


    public Collection<Cliente> listaDeClientes() {

        return clienteRepository.buscarClientes();
    }

    public Cliente deletarCliente(Cliente cliente) {
        clienteRepository.deletarCliente(cliente);
        return cliente;
    }


    public Cliente editarCliente(Integer id, Cliente cliente) {
        Cliente existente = clienteRepository.buscarPorId(id);

        existente.setCpf(cliente.getCpf());
        existente.setNome(cliente.getNome());
        existente.setEnderecos(cliente.getEnderecos());

        return clienteRepository.atualizar(existente);
    }
}
