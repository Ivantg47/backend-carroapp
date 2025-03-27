package com.tagi.backend.carroapp.backend_carroapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tagi.backend.carroapp.backend_carroapp.models.entities.Producto;
import com.tagi.backend.carroapp.backend_carroapp.repositories.ProductoReposiory;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoReposiory reposiory;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) reposiory.findAll();
    }
    
}
