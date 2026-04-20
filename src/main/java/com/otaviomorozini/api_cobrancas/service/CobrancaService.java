package com.otaviomorozini.api_cobrancas.service;

import com.otaviomorozini.api_cobrancas.dto.CobrancaRequestDTO;
import com.otaviomorozini.api_cobrancas.model.Cobranca;
import com.otaviomorozini.api_cobrancas.repository.CobrancaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
public class CobrancaService {
    private final CobrancaRepository cobrancaRepository;
    private final ClienteService clienteService; // Injetando o Service de Cliente

    public CobrancaService(CobrancaRepository cobrancaRepository, ClienteService clienteService) {
        this.cobrancaRepository = cobrancaRepository;
        this.clienteService = clienteService;
    }

    public Cobranca gerar(CobrancaRequestDTO dto) {
        // Busca o cliente pelo ID que veio no DTO
        var cliente = clienteService.buscaPorId(dto.clienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        Cobranca cobranca = new Cobranca();
        cobranca.setValor(dto.valor());
        cobranca.setDataVencimento(dto.dataVencimento());
        cobranca.setStatus(dto.status().name());
        cobranca.setCliente(cliente); // Faz o vínculo!

        return cobrancaRepository.save(cobranca);
    }

    public List<Cobranca> listaTodos() {
        return cobrancaRepository.findAll();
    }

    public void deletar(Long id) {
        if (!cobrancaRepository.existsById(id)) {
            throw new RuntimeException("Cobrança não encontrada");
        }
        cobrancaRepository.deleteById(id);
    }

}
