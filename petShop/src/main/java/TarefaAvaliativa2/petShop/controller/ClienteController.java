package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.request.ClienteRequest;
import TarefaAvaliativa2.petShop.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse criarCliente(
            @RequestBody ClienteRequest clienteRequest
    ) {
        Cliente model = clienteRequest.toModel();
        Cliente salvo = clienteService.criarNovo(model);
        return ClienteResponse.of(salvo);
        // return ClienteResponse.of(clienteService.criarNovo(clienteRequest.toModel));
    }

    @GetMapping
    public List<ClienteResponse> listarClientes(
            @RequestParam(name = "nome", required = false) String nomeCliente
    ) {
        return List.of(
                ClienteResponse.builder()
                        .id(1)
                        .nome("Teste")
                        .cpf("cpf")
                        .build()
        );
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCliente(@PathVariable Integer id) {

    }

    @PutMapping(path = "/{id}")
    public ClienteResponse editarCliente(@PathVariable Integer id,
                                         @RequestBody ClienteRequest clienteRequest) {
        return ClienteResponse.of(
                clienteService.editarCliente(id, clienteRequest.toModel()
                ));
    }

}