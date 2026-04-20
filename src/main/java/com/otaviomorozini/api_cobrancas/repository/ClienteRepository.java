package com.otaviomorozini.api_cobrancas.repository;

import com.otaviomorozini.api_cobrancas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
