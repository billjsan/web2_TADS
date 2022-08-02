package com.ifpe.edu.br.web2.model.repo;

import com.ifpe.edu.br.web2.model.OrgaoFiscalizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalizadorRepository extends JpaRepository<OrgaoFiscalizador, Long> {
}
