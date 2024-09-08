package com.unirating.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private Name name;

    @Column(name = "course_type")
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

  
    private enum Name{
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

    private enum Type{
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
