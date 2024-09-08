package com.unirating.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        review.setUserName(userName);
        reviewRepository.save(review);
        return "Review submitted successfully";
    }

    // @GetMapping("/search")
    // public List<Review> getReviews(
    //     @RequestParam(required = false) String courseName,
    //     @RequestParam(required = false) Integer courseNumber,
    //     @RequestParam(required = false) String courseType,
    //     @RequestParam(required = false) String professorName,
    //     @RequestParam(required = false) Integer courseRating) {

    //     return reviewService.getReviews(courseName, courseNumber, courseType, professorName, courseRating);
    // }
    @GetMapping("/search")
    public List<Review> searchReviews(
        @RequestParam(required = false) String courseName,
        @RequestParam(required = false) String professorName,
        @RequestParam(required = false) String courseType,
        @RequestParam(required = false) Integer courseNumber,
        @RequestParam(required = false) Integer reviewRating) {
        return reviewService.getReviewsByCriteria(courseName, professorName, courseType, courseNumber, reviewRating);
    }
}