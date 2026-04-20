package com.otaviomorozini.api_cobrancas.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record ClienteRequestDTO(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,
        @NotBlank
        @CPF
        String cpf
){
}
