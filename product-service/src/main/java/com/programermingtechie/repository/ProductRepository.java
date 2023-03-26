package com.programermingtechie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programermingtechie.module.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
