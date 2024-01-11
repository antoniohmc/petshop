package TarefaAvaliativa2.petShop.controller;

import TarefaAvaliativa2.petShop.Request.ClienteRequest;
import TarefaAvaliativa2.petShop.Response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private void cadastrarClientes(@RequestBody ClienteRequest clienteRequest) {

    }

    @PutMapping(path = "/{idCliente}")
    public void editarClientes(@PathVariable Integer idCliente, @RequestBody ClienteRequest clienteRequest) {

    }

    @GetMapping()
    private List<ClienteResponse> listaDeClientes(@RequestParam String nome) {
        return new ArrayList<>();
    }

    @DeleteMapping("/{idCliente}")
    private void deletarCliente(@PathVariable Integer idCliente) {

    }

}
