package com.piero.springcloud.msvc.products.repositories;

import com.piero.libs.msvc.commons.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
