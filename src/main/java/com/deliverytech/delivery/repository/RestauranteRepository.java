package com.deliverytech.delivery.repository;

import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends JpaRepository <Restaurante, Long>{
    // Buscar por nome
    Optional<Restaurante> findByNome(String nome);

    // Buscar restaurantes ativos
    List<Restaurante> findByAtivoTrue();

    // Buscar por categoria
    List<Restaurante> findByCategoria(String categoria);

}