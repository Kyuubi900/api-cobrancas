package com.otaviomorozini.api_cobrancas.controller;

import com.otaviomorozini.api_cobrancas.model.Cobranca;
import com.otaviomorozini.api_cobrancas.service.CobrancaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cobrancas")
public class CobrancaController {
    private final CobrancaService cobrancaService;

    public CobrancaController(CobrancaService cobrancaService) {
        this.cobrancaService = cobrancaService;
    }
    @PostMapping
    public ResponseEntity<Cobranca> gerarCobranca(@RequestBody Cobranca cobranca){
        return ResponseEntity.ok().body(cobrancaService.gerar(cobranca));
    }

    @GetMapping
    public ResponseEntity<List<Cobranca>> listarTodasCobrancas(){
        return ResponseEntity.ok().body(cobrancaService.listaTodos());
    }


}
