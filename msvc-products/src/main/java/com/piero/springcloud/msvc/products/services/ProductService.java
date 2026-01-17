package com.piero.springcloud.msvc.products.services;

import com.piero.springcloud.msvc.products.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findbyId(Long id);
}
