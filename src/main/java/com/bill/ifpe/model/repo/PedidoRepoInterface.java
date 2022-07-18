package com.bill.ifpe.model.repo;

import com.bill.ifpe.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepoInterface extends JpaRepository<Pedido, Long> {
}
