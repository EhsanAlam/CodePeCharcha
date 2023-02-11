package com.cpc.CodePeCharcha.model;

public class Course {
    private String courseId;
    private String courseName;
    private String duration;
    private String fees;
    private String description;

    public Course() {
    }

    public Course(String courseId, String courseName, String duration, String fees, String description) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
        this.description = description;

    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    public String getFees() {
        return fees;
    }

    public String getDescription() {
        return description;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
