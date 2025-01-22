package com.zup.pizzaria.repository;

import com.zup.pizzaria.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query( value = "SELECT * FROM Pedido p WHERE p.cliente.id : id",
            nativeQuery = true)
    Pedido buscarPedidoPorCliente(Long id);
}