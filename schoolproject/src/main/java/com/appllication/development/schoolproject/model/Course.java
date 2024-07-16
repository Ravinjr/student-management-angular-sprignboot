package com.appllication.development.schoolproject.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity // a class that connect with DB
@Table(name = "t_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID",nullable = false,updatable = false)
    private Integer courseId;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    // Its meaningful to create dept object either only deptId
    private Department department;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "DURATION")
    private String duration;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
