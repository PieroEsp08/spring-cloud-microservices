package com.piero.springcloud.msvc.items.clients;

import com.piero.springcloud.msvc.items.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc-products")
public interface ProductFeignClient {

    @GetMapping
    List<Product> findAll();

    @GetMapping("/{id}")
    Product details(@PathVariable Long id);

    @PostMapping
    public Product create(@RequestBody Product product);

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product,@PathVariable Long id);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id);




}
