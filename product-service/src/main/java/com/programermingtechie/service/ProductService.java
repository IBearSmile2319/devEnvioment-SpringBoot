package com.programermingtechie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.programermingtechie.dto.ProductRequest;
import com.programermingtechie.dto.ProductResponse;
import com.programermingtechie.module.Product;
import com.programermingtechie.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {


    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                // .category(productRequest.getCategory())
                // .quantity(productRequest.getQuantity())
                // .imageUrl(productRequest.getImageUrl())
                .build();

        productRepository.save(product);
        log.info("Product {} created", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                // .category(product.getCategory())
                // .quantity(product.getQuantity())
                // .imageUrl(product.getImageUrl())
                .build();
    }
    
}
