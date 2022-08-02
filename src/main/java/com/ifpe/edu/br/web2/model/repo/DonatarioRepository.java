package com.ifpe.edu.br.web2.model.repo;

import com.ifpe.edu.br.web2.model.OrgaoDonatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonatarioRepository extends JpaRepository<OrgaoDonatario, Long> {

}
