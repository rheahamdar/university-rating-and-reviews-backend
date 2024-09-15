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
       "(COALESCE(:reviewRating, 0) = 0 OR r.courseRating = :reviewRating) AND " +
       "(COALESCE(:semester, '') = '' OR r.semester = :semester)")
    List<Review> findByCriteria(
        @Param("courseName") String courseName,
        @Param("professorName") String professorName,
        @Param("courseType") String courseType,
        @Param("courseNumber") Integer courseNumber,
        @Param("reviewRating") Double reviewRating,
        @Param("semester") String semester
    );
} 
