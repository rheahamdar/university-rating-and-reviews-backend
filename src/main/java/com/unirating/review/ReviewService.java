package com.unirating.review;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsByCriteria(String courseName, String professorName, String courseType, Integer courseNumber, Integer reviewRating) {
        return reviewRepository.findByCriteria(courseName, professorName, courseType, courseNumber, reviewRating);
    }

    // public List<Review> getReviews( String courseName,Integer courseNumber,String courseType,String professorName,Integer courseRating) {
    //     if (courseName != null && courseNumber != null && courseType != null && professorName != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndCourseTypeAndProfessorNameAndCourseRating(courseName, courseNumber, courseType, professorName, courseRating);
    //     }else if (courseName != null && courseNumber != null && courseType != null && professorName != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndCourseTypeAndProfessorName(courseName, courseNumber, courseType, professorName);
    //     }else if (courseName != null && courseNumber != null && courseType != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndCourseTypeAndCourseRating(courseName, courseNumber, courseType, courseRating);
    //     }else if (courseName != null && courseNumber != null && professorName != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndProfessorNameAndCourseRating(courseName, courseNumber, professorName, courseRating);
    //     }else if (courseName != null && courseNumber != null && professorName != null && courseType != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndProfessorNameAndCourseType(courseName, courseNumber, professorName, courseType);
    //     }else if (courseName != null && courseType != null && professorName != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndCourseTypeAndProfessorNameAndCourseRating(courseName, courseType, professorName, courseRating);
    //     }else if (courseName != null && courseNumber != null && courseType != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndCourseType(courseName, courseNumber, courseType);
    //     }else if (courseName != null && courseNumber != null && professorName != null) {
    //         return reviewRepository.findByCourseNameAndCourseNumberAndProfessorName(courseName, courseNumber, professorName);
    //     }else if (courseName != null && courseType != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndCourseTypeAndCourseRating(courseName, courseType, courseRating);
    //     }else if (courseName != null && professorName != null && courseRating != null) {
    //         return reviewRepository.findByCourseNameAndProfessorNameAndCourseRating(courseName, professorName, courseRating);
    //     }else if (courseName != null && courseType != null) {
    //         return reviewRepository.findByCourseNameAndCourseType(courseName, courseType);
    //     }else if (courseName != null && professorName != null) {
    //         return reviewRepository.findByCourseNameAndProfessorName(courseName, professorName);
    //     }else if (courseName != null) {
    //         return reviewRepository.findByCourseName(courseName);
    //     }else if (courseType != null) {
    //         return reviewRepository.findByCourseType(courseType);
    //     }else if (professorName != null) {
    //         return reviewRepository.findByProfessorName(professorName);
    //     }else if (courseRating != null) {
    //         return reviewRepository.findByCourseRating(courseRating);
    //     }else{
    //         return null;
    //     }
    // }
}
