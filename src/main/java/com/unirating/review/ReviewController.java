package com.unirating.review;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public String createReview(@RequestBody Review review) throws IOException {
        String comment = review.getReviewText().trim();
        OkHttpClient client = new OkHttpClient();
        okhttp3.RequestBody requestBody = okhttp3.RequestBody.create(MediaType.get("application/json"),
        "{\"comment\":\"" + comment + "\"}");

        Request request = new Request.Builder()
                        .url("http://0.0.0.0:5000/check_profanity")
                        .post(requestBody)
                        .build();

        Response response = client.newCall(request).execute();
        String responseBody = response.body().string().trim();  
        if (responseBody.equals("1")) {
            return "Please remove any inappropriate word";
        }

        String username = review.getUsername();
        if(username.length()>0)
            review.setUsername(username.substring(0, username.indexOf('@')));
        review.setReviewText(comment);
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