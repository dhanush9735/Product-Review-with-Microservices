package com.microservices.feedback.service;

import com.microservices.feedback.common.CommonObject;
import com.microservices.feedback.common.Product;
import com.microservices.feedback.dto.FeedbackDTO;
import com.microservices.feedback.entity.Feedbacks;
import com.microservices.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Feedbacks addFeedback(FeedbackDTO feedbackDTO) {
        Feedbacks f = new Feedbacks();
        f.setFeedback(feedbackDTO.getFeedback());
        f.setRating(feedbackDTO.getRating());
        f.setProductId(feedbackDTO.getProductId());

        return feedbackRepository.save(f);
    }

    @Override
    public List<Feedbacks> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @Override
    public CommonObject getFeedbackOfProduct(int feedbackId) {
        CommonObject commonObject = new CommonObject();
        Feedbacks f = feedbackRepository.findByFeedbackId(feedbackId);

        Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + f.getProductId(), Product.class);

        commonObject.setFeedbacks(f);
        commonObject.setProduct(product);

        return commonObject;



    }
}
