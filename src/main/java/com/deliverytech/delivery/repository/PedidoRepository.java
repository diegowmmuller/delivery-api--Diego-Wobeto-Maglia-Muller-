package com.deliverytech.delivery.repository;

import java.util.List;

import com.deliverytech.delivery.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

    // Buscar pedidos por cliente ID
    List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);

    // Buscar por número do pedido
    Pedido findByNumeroPedido(String numeroPedido);

    //Buscar pedidos por restaurante ID
    List<Pedido> findByRestauranteIdOrderByDataPedidoDesc(Long restauranteId);

}