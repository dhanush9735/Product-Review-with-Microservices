package com.microservices.feedback.controller;

import com.microservices.feedback.common.CommonObject;
import com.microservices.feedback.dto.FeedbackDTO;
import com.microservices.feedback.entity.Feedbacks;
import com.microservices.feedback.service.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/add")
    public ResponseEntity<String> addAFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        feedbackService.addFeedback(feedbackDTO);
        return new ResponseEntity<>("Added", HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<Feedbacks> fetchAllFeedbacks() {
        return feedbackService.getAllFeedback();
    }
    @GetMapping("/{feedbackId}")
    public CommonObject fetchFeedbackWithProduct(@PathVariable int feedbackId) {
        return feedbackService.getFeedbackOfProduct(feedbackId);
    }


}
