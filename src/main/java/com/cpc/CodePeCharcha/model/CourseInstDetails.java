package com.cpc.CodePeCharcha.model;

import java.util.List;

public class CourseInstDetails {
    private Course course;
    private List<Instructor> instructorList;

    public CourseInstDetails(Course course, List<Instructor> instructorList) {
        this.course = course;
        this.instructorList = instructorList;
    }

    public CourseInstDetails() {
    }

    public Course getCourse() {
        return course;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
}
