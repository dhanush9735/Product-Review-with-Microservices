package com.microservices.product.service;

import com.microservices.product.dto.ProductDTO;
import com.microservices.product.entity.Product;
import com.microservices.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product addProduct(ProductDTO productDTO) {
        Product p = new Product();
        p.setProductName(productDTO.getProductName());
        p.setProductPrice(productDTO.getProductPrice());
        p.setCategory(productDTO.getCategory());
        p.setProductUrl(productDTO.getProductUrl());


        return productRepository.save(p);    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product fetchProductById(int productId) {
        return productRepository.findByProductId(productId);
    }
}
