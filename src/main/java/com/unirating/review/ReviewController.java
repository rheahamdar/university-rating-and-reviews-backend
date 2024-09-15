package com.unirating.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public String createReview(@RequestBody Review review) {
        String username = review.getUsername();
        if(username.length()>0)
            review.setUsername(username.substring(0, username.indexOf('@')));
        reviewRepository.save(review);
        return "Review submitted successfully";
    }

    @GetMapping("/search")
    public List<Review> searchReviews(
        @RequestParam(required = false) String courseName,
        @RequestParam(required = false) String professorName,
        @RequestParam(required = false) String courseType,
        @RequestParam(required = false) Integer courseNumber,
        @RequestParam(required = false) Double reviewRating,
        @RequestParam(required = false) String semester) {
        return reviewService.getReviewsByCriteria(courseName, professorName, courseType, courseNumber, reviewRating,semester);
    }
}