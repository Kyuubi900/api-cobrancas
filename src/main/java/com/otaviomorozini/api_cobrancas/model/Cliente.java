package com.otaviomorozini.api_cobrancas.model;

import com.otaviomorozini.api_cobrancas.dto.ClienteRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void atualizarInformacoes(ClienteRequestDTO dto) {
        if (dto.nome() != null && !dto.nome().trim().isEmpty()) {
            this.nome = dto.nome();
        }
        if (dto.email() != null && !dto.email().trim().isEmpty()) {
            this.email = dto.email();
        }
        if (dto.cpf() != null && !dto.cpf().trim().isEmpty()) {
            this.cpf = dto.cpf();
        }
    }

}
