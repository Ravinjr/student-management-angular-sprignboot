package com.appllication.development.schoolproject.dto;

import com.appllication.development.schoolproject.model.Course;
import com.appllication.development.schoolproject.model.Instructor;
import com.appllication.development.schoolproject.model.InstructorCourse;

public class InstructorCourseDTO {
    private Integer instructorCourseId;
    private Integer courseId;
    private String courseName;
    private Integer instructorId;
    private String instructorName;

    public InstructorCourseDTO(InstructorCourse instructorCourse) {
        this.instructorCourseId = instructorCourse.getInstructorCourseId();
        this.courseId = instructorCourse.getCourse().getCourseId();
        this.courseName = instructorCourse.getCourse().getCourseName();
        this.instructorId = instructorCourse.getInstructor().getInstructorId();
        this.instructorName = instructorCourse.getInstructor().getFirstName();
    }

    public Integer getInstructorCourseId() {
        return instructorCourseId;
    }

    public void setInstructorCourseId(Integer instructorCourseId) {
        this.instructorCourseId = instructorCourseId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {

        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    //    public Integer getInstructorCourseId() {
//        return instructorCourseId;
//    }
//
//    public void setInstructorCourseId(Integer instructorCourseId) {
//        this.instructorCourseId = instructorCourseId;
//    }
//
//    public Instructor getInstructor() {
//        return instructor;
//    }
//
//    public void setInstructor(Instructor instructor) {
//        this.instructor = instructor;
//    }
//
//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }
//
//    public Integer getInstructorId() {
//        return instructorId;
//    }
//
//    public void setInstructorId(Integer instructorId) {
//        this.instructorId = instructorId;
//    }
//
//    public String getInstructorName() {
//        return instructorName;
//    }
//
//    public void setInstructorName(String instructorName) {
//        this.instructorName = instructorName;
//    }
}
