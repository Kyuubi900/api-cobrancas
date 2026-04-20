package com.otaviomorozini.api_cobrancas.controller;

import com.otaviomorozini.api_cobrancas.model.Cliente;
import com.otaviomorozini.api_cobrancas.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok().body(clienteService.salvar(cliente));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodosClientes(){
        return ResponseEntity.ok().body(clienteService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> ListarClientePorId(@PathVariable Long id){
        return ResponseEntity.of(clienteService.buscaPorId(id));
    }
}
