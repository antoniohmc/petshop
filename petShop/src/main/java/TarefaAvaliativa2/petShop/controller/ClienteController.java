package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.controller.cliente.ClienteMapper;
import TarefaAvaliativa2.petShop.controller.cliente.ClienteRequest;
import TarefaAvaliativa2.petShop.controller.cliente.ClienteResponse;
import TarefaAvaliativa2.petShop.model.Cliente;
import TarefaAvaliativa2.petShop.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

        return ClienteMapper
                .mapToClienteResponse(salvo);

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