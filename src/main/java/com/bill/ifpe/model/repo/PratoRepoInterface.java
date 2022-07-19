package com.bill.ifpe.model.repo;

import com.bill.ifpe.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PratoRepoInterface extends JpaRepository<Prato, Long> {

}
