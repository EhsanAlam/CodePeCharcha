package com.cpc.CodePeCharcha.model;

public class StudentComment {
    private String studentId;
    private String studentComment;

    public StudentComment(){
    }
    public StudentComment(String studentId, String studentComment){
        this.studentId=studentId;
        this.studentComment=studentComment;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentComment() {
        return studentComment;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentComment(String studentComment) {
        this.studentComment = studentComment;
    }
}
