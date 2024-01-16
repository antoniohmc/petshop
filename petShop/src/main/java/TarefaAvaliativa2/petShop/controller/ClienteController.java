package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.request.ClienteRequest;
import TarefaAvaliativa2.petShop.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse cadastrarClientes(@RequestBody ClienteRequest clienteRequest) {

        return new ClienteResponse();
    }

    @PutMapping(path = "/{idCliente}")
    public List<ClienteResponse> editarClientes(@PathVariable Integer idCliente, @RequestBody ClienteRequest clienteRequest) {

        return new ArrayList<>();
    }

    @GetMapping()
    public List<ClienteResponse> listaDeClientes(@RequestParam String nome) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{idCliente}")
    public List<ClienteResponse> deletarCliente(@PathVariable Integer idCliente) {

        return new ArrayList<>();
    }

}
