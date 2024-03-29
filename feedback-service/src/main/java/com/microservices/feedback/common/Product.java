package com.microservices.feedback.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private String category;
    private String productUrl;
}
