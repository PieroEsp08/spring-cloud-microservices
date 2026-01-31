package com.piero.springcloud.msvc.items.services;

import com.piero.springcloud.msvc.items.entities.Item;
import com.piero.springcloud.msvc.items.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> findAll();

    Optional<Item> findById(Long id);

    Product save(Product product);

    Product update(Product product, Long id);

    void delete(Long id);

}
