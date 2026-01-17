package com.piero.springcloud.msvc.products.services;

import com.piero.springcloud.msvc.products.entities.Product;
import com.piero.springcloud.msvc.products.repositories.ProductRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {


    final private ProductRepository repository;
    final private Environment enviroment;

    public ProductServiceImpl(ProductRepository repository, Environment environment){
        this.enviroment = environment;
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return ((List<Product>) repository.findAll()).stream().map(product -> {
            product.setPort(Integer.parseInt(enviroment.getProperty("local.server.port")));
            return product;
        }).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findbyId(Long id) {
        return repository.findById(id).map(product -> {
            product.setPort(Integer.parseInt(enviroment.getProperty("local.server.port")));
            return product;
        });
    }
}
