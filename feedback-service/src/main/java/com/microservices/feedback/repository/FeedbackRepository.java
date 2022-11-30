package com.microservices.feedback.repository;

import com.microservices.feedback.entity.Feedbacks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedbacks, Integer> {
    Feedbacks findByFeedbackId(int feedbackId);
}
