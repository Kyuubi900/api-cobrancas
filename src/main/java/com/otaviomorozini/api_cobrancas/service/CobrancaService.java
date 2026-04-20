package com.otaviomorozini.api_cobrancas.service;

import com.otaviomorozini.api_cobrancas.model.Cobranca;
import com.otaviomorozini.api_cobrancas.repository.CobrancaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CobrancaService {

    private final CobrancaRepository cobrancaRepository;

    public CobrancaService(CobrancaRepository cobrancaRepository) {
        this.cobrancaRepository = cobrancaRepository;
    }

    public Cobranca gerar(Cobranca cobranca){
        return cobrancaRepository.save(cobranca);
    }
    public List<Cobranca> listaTodos(){
        return cobrancaRepository.findAll();
    }
}
