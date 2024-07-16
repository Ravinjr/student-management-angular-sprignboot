package com.appllication.development.schoolproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_instructor_course")
public class InstructorCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INSTRUCTOR_COURSE_ID",nullable = false,updatable = false)
    private Integer instructorCourseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTRUCTOR_ID")
    private Instructor instructor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    public Integer getInstructorCourseId() {
        return instructorCourseId;
    }

    public void setInstructorCourseId(Integer instructorCourseId) {
        this.instructorCourseId = instructorCourseId;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
