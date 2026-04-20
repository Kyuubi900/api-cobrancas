package com.otaviomorozini.api_cobrancas.dto;

import com.otaviomorozini.api_cobrancas.model.StatusCobranca;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

public record CobrancaRequestDTO (
        @NotNull @Positive BigDecimal valor,
        @NotNull LocalDate dataVencimento,
        @NotNull StatusCobranca status,
        @NotNull Long clienteId
){
}
