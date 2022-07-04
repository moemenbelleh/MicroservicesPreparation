package com.mycompany.productservice.controller;


import com.mycompany.productservice.entity.ProductEntity;
import com.mycompany.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public /*ResponseEntity<List<ProductEntity>>*/List<ProductEntity> getAllProducts(){

        return productRepository.findAll();
        /*
        le contenu complet de la methode si on ne met pas @ResponseStatus(HttpStatus.ok)

        ListProductEntity> productEntities = productRepository.findAll();
        ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<>(productEntities, HttpStatus.OK)
        return responseEntity;
         */
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }

}
