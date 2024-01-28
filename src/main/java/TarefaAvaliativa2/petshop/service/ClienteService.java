package tarefaavaliativa2.petshop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tarefaavaliativa2.petshop.model.Cliente;
import tarefaavaliativa2.petshop.repository.ClienteRepositoryService;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepositoryService clienteRepository;


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
