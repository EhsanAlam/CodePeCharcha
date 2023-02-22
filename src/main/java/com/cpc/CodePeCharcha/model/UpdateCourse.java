package com.cpc.CodePeCharcha.model;

public class UpdateCourse {
    private String studentId;
    private String courseId;
    private String courseId1;

    UpdateCourse(){
    }
    UpdateCourse(String studentId,String courseId,String courseId1){
        this.studentId=studentId;
        this.courseId=courseId;
        this.courseId1=courseId1;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId1() {
        return courseId1;
    }

    public void setCourseId1(String courseId1) {
        this.courseId1 = courseId1;
    }
}

