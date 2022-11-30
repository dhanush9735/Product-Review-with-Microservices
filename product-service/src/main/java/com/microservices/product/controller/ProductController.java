package com.microservices.product.controller;

import com.microservices.product.dto.ProductDTO;
import com.microservices.product.entity.Product;
import com.microservices.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<String> addAProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);
        return new ResponseEntity<>("Product added", HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<Product> fetchAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{productId}")
    public Product fetchAProductById(@PathVariable int productId) {
        return productService.fetchProductById(productId);
    }

}
