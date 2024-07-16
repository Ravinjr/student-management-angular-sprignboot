package com.appllication.development.schoolproject.dto;

import com.appllication.development.schoolproject.model.Department;
import com.appllication.development.schoolproject.model.Instructor;
import com.appllication.development.schoolproject.model.InstructorCourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InstructorDTO {
    private Integer instructorId;
    private Integer departmentId;
    private String departmentName;
    private String firstName;
    private String lastName;
    private String city;

    public List<InstructorCourseDTO> instructorCourses;// for display courses of the instructor
    //DTO used to reduce the weight of the InstructorCourse entity class
    public InstructorDTO() {

    }

    public InstructorDTO(Instructor instructor){
        this.instructorId=instructor.getInstructorId();
        this.firstName=instructor.getFirstName();
        this.lastName=instructor.getLastName();
        this.city=instructor.getCity();
        this.departmentName=instructor.getDepartment().getDepartmentName();
        this.departmentId=instructor.getDepartment().getDepartmentId();

        for (InstructorCourse instructorCourse:instructor.getInstructorCourses()){
            InstructorCourseDTO instructorCourseDTO=new InstructorCourseDTO(instructorCourse);
            this.getInstructorCourses().add(instructorCourseDTO);
        }
    }

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public List<InstructorCourseDTO> getInstructorCourses() {
        if (instructorCourses==null){
            this.instructorCourses=new ArrayList<>();
        }
        return instructorCourses;
    }

    public void setInstructorCourses(List<InstructorCourseDTO> instructorCourses) {
        this.instructorCourses = instructorCourses;
    }
}
