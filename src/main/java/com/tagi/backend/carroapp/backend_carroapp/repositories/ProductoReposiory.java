package com.tagi.backend.carroapp.backend_carroapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tagi.backend.carroapp.backend_carroapp.models.entities.Producto;

public interface ProductoReposiory extends CrudRepository<Producto, Long> {
    
}
