package com.microservices.product.service;

import com.microservices.product.dto.ProductDTO;
import com.microservices.product.entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(ProductDTO productDTO);

    public List<Product> getAllProducts();
    public Product fetchProductById(int productId);
}
