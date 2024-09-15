package com.unirating.review;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsByCriteria(String courseName, String professorName, String courseType, Integer courseNumber, Double reviewRating,String semester) {
        return reviewRepository.findByCriteria(courseName, professorName, courseType, courseNumber, reviewRating,semester);
    }

}