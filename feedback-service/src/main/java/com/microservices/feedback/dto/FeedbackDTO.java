package com.microservices.feedback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FeedbackDTO {
    private int feedbackId;
    private double rating;
    private String feedback;
    private int productId;
}
