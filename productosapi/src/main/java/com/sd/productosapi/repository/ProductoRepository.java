package com.sd.productosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sd.productosapi.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}