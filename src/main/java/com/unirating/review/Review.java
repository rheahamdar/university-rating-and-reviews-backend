package com.unirating.review;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    @NonNull
    private String courseName;

    @Column(name = "course_number")
    @NonNull
    private int courseNumber;  

    @Column(name = "course_type")
    @NonNull
    private String courseType; 

    @Column(name = "professor_name")
    @NonNull
    private String professorName;

    @Column(name = "course_rating")
    @NonNull
    private double courseRating;

    @Column(name = "review_text", columnDefinition = "TEXT")
    @NonNull
    private String reviewText;

    @Column(name = "semester")
    @NonNull
    private String semester;

    @Column(name = "user_name")
    @NonNull
    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseNumber() {
        return courseNumber;
    }
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    public String getCourseType() {
        return courseType;
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    public String getProfessorName() {
        return professorName;
    }
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
    public String getReviewText() {
        return reviewText;
    }
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    public double getCourseRating() {
        return courseRating;
    }
    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }
   


   
}