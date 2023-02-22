package com.cpc.CodePeCharcha.model;

import java.util.List;

public class StudentCommentDetail {
    private Student student;
    private List<String> comment;
    public StudentCommentDetail(){
    }
    public StudentCommentDetail(Student student,List<String> comment){
        this.student =student;
        this.comment=comment;

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }
}
