package com.otaviomorozini.api_cobrancas.service;

import com.otaviomorozini.api_cobrancas.model.Cliente;
import com.otaviomorozini.api_cobrancas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscaPorId(Long id){
        return clienteRepository.findById(id);
    }
}
