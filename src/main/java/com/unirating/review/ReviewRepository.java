package com.unirating.review;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("SELECT r FROM Review r WHERE " +
       "(COALESCE(:courseName, '') = '' OR r.courseName = :courseName) AND " +
       "(COALESCE(:professorName, '') = '' OR r.professorName = :professorName) AND " +
       "(COALESCE(:courseType, '') = '' OR r.courseType = :courseType) AND " +
       "(COALESCE(:courseNumber, 0) = 0 OR r.courseNumber = :courseNumber) AND " +
       "(COALESCE(:reviewRating, 0) = 0 OR r.courseRating = :reviewRating)")
List<Review> findByCriteria(
    @Param("courseName") String courseName,
    @Param("professorName") String professorName,
    @Param("courseType") String courseType,
    @Param("courseNumber") Integer courseNumber,
    @Param("reviewRating") Integer reviewRating
);
//     List<Review> findByCourseName(String courseName);
//     List<Review> findByCourseNumber(Integer courseNumber);
//     List<Review> findByCourseType(String courseType);
//     List<Review> findByProfessorName(String professorName);
//     List<Review> findByCourseRating(Integer courseRating);
//     List<Review> findByCourseNameAndCourseNumber(String courseName, Integer courseNumber);
//     List<Review> findByCourseNameAndCourseType(String courseName, String courseType);
//     List<Review> findByCourseNameAndProfessorName(String courseName, String professorName);
//     List<Review> findByCourseNameAndCourseRating(String courseName, Integer courseRating);
//     List<Review> findByCourseTypeAndProfessorName(String courseType, String professorName);
//     List<Review> findByCourseTypeAndCourseRating(String courseType, Integer courseRating);
//     List<Review> findByProfessorNameAndCourseRating(String professorName, Integer courseRating);
//     List<Review> findByCourseNameAndCourseNumberAndCourseType(String courseName, Integer courseNumber, String courseType);
//     List<Review> findByCourseNameAndCourseNumberAndProfessorName(String courseName, Integer courseNumber, String professorName);
//     List<Review> findByCourseNameAndCourseNumberAndCourseRating(String courseName, Integer courseNumber, Integer courseRating);
//     List<Review> findByCourseNameAndCourseTypeAndProfessorName(String courseName, String courseType, String professorName);
//     List<Review> findByCourseNameAndCourseTypeAndCourseRating(String courseName, String courseType, Integer courseRating);
//     List<Review> findByCourseNameAndProfessorNameAndCourseRating(String courseName, String professorName, Integer courseRating);
//     List<Review> findByCourseTypeAndProfessorNameAndCourseRating(String courseType, String professorName, Integer courseRating);
//     List<Review> findByCourseNameAndCourseNumberAndProfessorNameAndCourseType(String courseName,Integer courseNumber,String professorName,String courseType);
//     List<Review> findByCourseNameAndCourseNumberAndCourseTypeAndProfessorName(String courseName, Integer courseNumber, String courseType, String professorName);
//     List<Review> findByCourseNameAndCourseNumberAndCourseTypeAndCourseRating(String courseName, Integer courseNumber, String courseType, Integer courseRating);
//     List<Review> findByCourseNameAndCourseNumberAndProfessorNameAndCourseRating(String courseName, Integer courseNumber, String professorName, Integer courseRating);
//     List<Review> findByCourseNameAndCourseTypeAndProfessorNameAndCourseRating(String courseName, String courseType, String professorName, Integer courseRating);
//     List<Review> findByCourseNameAndCourseNumberAndCourseTypeAndProfessorNameAndCourseRating(String courseName, Integer courseNumber, String courseType, String professorName, Integer courseRating);
} 
