package com.tagi.backend.carroapp.backend_carroapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tagi.backend.carroapp.backend_carroapp.models.entities.Producto;
import com.tagi.backend.carroapp.backend_carroapp.services.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping("/productos")
    public List<Producto> list() {
        return service.findAll();
    }
}
