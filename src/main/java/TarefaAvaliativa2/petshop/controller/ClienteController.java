package tarefaavaliativa2.petshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import tarefaavaliativa2.petshop.controller.cliente.ClienteMapper;
import tarefaavaliativa2.petshop.controller.cliente.ClienteRequest;
import tarefaavaliativa2.petshop.controller.cliente.ClienteResponse;
import tarefaavaliativa2.petshop.model.Cliente;
import tarefaavaliativa2.petshop.service.ClienteService;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/clientes")
public class ClienteController {

    private final ClienteService clienteService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse criarCliente(@RequestBody ClienteRequest clienteRequest) {
        Cliente model = clienteRequest.toModel();
        Cliente salvo = clienteService.criarNovo(model);

        return ClienteMapper.mapToClienteResponse(salvo);

    }

    @GetMapping
    public Collection<ClienteResponse> listarClientes(@RequestParam(name = "nome", required = false) String nomeCliente) {

        return clienteService.listaDeClientes()
                .stream()
                .map(ClienteMapper::mapToClienteResponse)
                .toList();
    }

    @DeleteMapping(path = "/{id}")
    public ClienteResponse deletarCliente(@PathVariable Integer id,
                                          @RequestBody ClienteRequest clienteRequest) {
        Cliente model = clienteRequest.toModel();
        Cliente deletado = clienteService.deletarCliente(model);

        return ClienteMapper
                .mapToClienteResponse(deletado);
    }

    @PutMapping(path = "/{id}")
    public ClienteResponse editarCliente(@PathVariable Integer id,
                                         @RequestBody ClienteRequest clienteRequest) {

        return ClienteMapper
                .mapToClienteResponse(clienteService.editarCliente(id, clienteRequest.toModel()));
    }

}