package com.microservices.feedback.common;

import com.microservices.feedback.entity.Feedbacks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonObject {
    private Product product;
    private Feedbacks feedbacks;
}
