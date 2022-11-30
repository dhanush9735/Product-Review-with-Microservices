package com.microservices.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private double productPrice;
    private String category;
    private String productUrl;


//    public Product(int productId, String productName, double productPrice, String category, Seller seller) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productPrice = productPrice;
//        this.category = category;
//        this.seller = seller;
//    }

}

