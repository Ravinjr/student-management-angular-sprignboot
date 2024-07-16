package com.appllication.development.schoolproject.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INSTRUCTOR_ID", nullable = false, updatable = false)
    private Integer instructorId;

    @ManyToOne//one department has many instructors
    //from instructor towards department there is many to one relationship
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CITY")
    private String city;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "instructor")
    private Set<InstructorCourse> instructorCourses;//courses which instructor do

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<InstructorCourse> getInstructorCourses() {
        if(instructorCourses==null){
            this.instructorCourses=new HashSet<>();
        }
        return instructorCourses;
    }

    public void setInstructorCourses(Set<InstructorCourse> instructorCourses) {
        this.instructorCourses = instructorCourses;
    }
}





