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
    private int courseRating;

    @Column(name = "review_text", columnDefinition = "TEXT")
    @NonNull
    private String reviewText;

    @Column(name="user_name")
    @NonNull
    private String userName;

    private enum CourseType{
        NATURAL_SCIENCE,
        SOCIAL_SCIENCE1,
        SOCIAL_SCIENCE2,
        CMPS_ELECTIVE,
        CMPS_MAJOR,
        CMPS_MINOR,
        CHEM_ELECTIVE,
        CHEM_MAJOR,
        CHEM_MINOR,
        BIO_ELECTIVE,
        BIO_MAJOR,
        BIO_MINOR,
        HUMANITIES1,
        HUMANITIES2,
        CHLA1,
        CHLA2,
        ARAB,
        MATH_MAJOR,
        MATH_ELECTIVE,
        MATH_MINOR,
        ENGL_MAJOR,
        ENGL_MINOR,
        ENGL_ELECTIVE,
        ENGL_REQUIREMENT,
        HIST_MAJOR,
        HIST_MINOR,
        HIST_ELECTIVE
    }

    private enum CourseName{
        CMPS,
        ECON,
        BUSS,
        BIO,
        CHEM,
        MATH,
        PHYS,
        ENGL,
        CHLA,
        HIST,
        GEOL,
        ARAB,
        EECE,
        CCE,
        INDE,
        MRKT,
        MECH,
        MUSC,
        PHIL,
        STAT
    }

    private enum ProfessorName{
        HAIDAR_SAFA("Haidar Safa"),
        FATIMA_ABU_SALEM("Fatima Abu Salem"),
        MAURICE_KHABBAZ("Maurice Khabbaz"),
        WADI_JUREIDI("Wadi Jureidi"),
        RAHEEL_SAEED("Saeed Raheel"),
        RIDA_ASSAF("Rida Assaf"),
        IZZAT_ELHAJJ("Izzat El Hajj"),
        AMER_MOUAWAD("Amer Mouawad"),
        MOHAMED_KOBEISSI("Mohamed Kobeissi"),
        WISSAM_RAJI("Wissam Raji"),
        ABBAS_ALHAKIM("Abbas Al Hakim"),
        RYAN_JOHNSON("Ryan Johnson"),
        SOHA_RIMAN("Soha Riman"),
        RIMA_DEEB("Rima Deeb"),
        ERIC_GOODFIELD("Eric Goodfield"),
        MAHER_JARRAR("Maher Jarrar");

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        ProfessorName(String name){
            this.name = name;
        }
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
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getReviewText() {
        return reviewText;
    }
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    public int getCourseRating() {
        return courseRating;
    }
    public void setCourseRating(int courseRating) {
        this.courseRating = courseRating;
    }
   


   
}