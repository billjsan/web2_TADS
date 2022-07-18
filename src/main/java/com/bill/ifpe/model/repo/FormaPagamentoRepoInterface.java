package com.bill.ifpe.model.repo;

import com.bill.ifpe.model.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepoInterface extends JpaRepository<FormaPagamento, Long> {

}
