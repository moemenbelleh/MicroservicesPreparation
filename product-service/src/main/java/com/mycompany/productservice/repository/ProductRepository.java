package com.mycompany.productservice.repository;

import com.mycompany.productservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
