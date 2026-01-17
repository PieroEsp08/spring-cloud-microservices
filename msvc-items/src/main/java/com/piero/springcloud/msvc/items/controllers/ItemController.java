package com.piero.springcloud.msvc.items.controllers;

import com.piero.springcloud.msvc.items.entities.Item;
import com.piero.springcloud.msvc.items.services.ItemService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {


    private ItemService service;

    public ItemController(@Qualifier("itemServiceWebClient") ItemService service){
        this.service = service;
    }

    @GetMapping
    public List<Item> list(@RequestParam(name="name", required = false) String name, @RequestHeader(name = "token-request", required = false) String token){
        System.out.println(name);
        System.out.println(token);
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> details(@PathVariable Long id){
        Optional<Item> itemOptional = service.findById(id);
        if(itemOptional.isPresent()){
            return ResponseEntity.ok(itemOptional.get());
        }
        return ResponseEntity.status(404).body(Collections.singletonMap("message", "No existe el producto en el microservicios msvc-products"));
    }


}
