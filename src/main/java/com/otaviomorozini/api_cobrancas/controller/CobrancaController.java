package com.otaviomorozini.api_cobrancas.controller;

import com.otaviomorozini.api_cobrancas.dto.CobrancaRequestDTO;
import com.otaviomorozini.api_cobrancas.model.Cobranca;
import com.otaviomorozini.api_cobrancas.service.CobrancaService;
import jakarta.validation.Valid;
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
    public ResponseEntity<Cobranca> gerarCobranca(@RequestBody @Valid CobrancaRequestDTO dto) {
        return ResponseEntity.ok(cobrancaService.gerar(dto));
    }

    @GetMapping
    public ResponseEntity<List<Cobranca>> listarTodasCobrancas() {
        return ResponseEntity.ok(cobrancaService.listaTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        cobrancaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}