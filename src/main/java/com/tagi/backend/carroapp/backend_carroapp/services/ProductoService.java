package com.tagi.backend.carroapp.backend_carroapp.services;

import java.util.List;

import com.tagi.backend.carroapp.backend_carroapp.models.entities.Producto;

public interface ProductoService {
    List<Producto> findAll();
}
