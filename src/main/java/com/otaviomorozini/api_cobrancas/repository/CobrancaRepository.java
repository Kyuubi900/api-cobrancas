package com.otaviomorozini.api_cobrancas.repository;

import com.otaviomorozini.api_cobrancas.model.Cobranca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {
}
