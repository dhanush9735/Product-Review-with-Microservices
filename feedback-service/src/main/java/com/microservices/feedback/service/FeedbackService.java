package com.microservices.feedback.service;

import com.microservices.feedback.common.CommonObject;
import com.microservices.feedback.dto.FeedbackDTO;
import com.microservices.feedback.entity.Feedbacks;

import java.util.List;

public interface FeedbackService {
    public Feedbacks addFeedback(FeedbackDTO feedbackDTO);
    public List<Feedbacks> getAllFeedback();
    public CommonObject getFeedbackOfProduct(int feedbackId);
}
