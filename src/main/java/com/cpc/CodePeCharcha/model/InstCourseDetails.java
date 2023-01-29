package com.cpc.CodePeCharcha.model;

import java.util.List;

public class InstCourseDetails {
   private Instructor instructor;
   private List<Course> courses;

    public InstCourseDetails() {
    }

    public InstCourseDetails(Instructor instructor, List<Course> courses) {
        this.instructor = instructor;
        this.courses = courses;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
