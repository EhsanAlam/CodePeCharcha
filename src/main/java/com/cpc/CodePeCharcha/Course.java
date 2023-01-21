package com.cpc.CodePeCharcha;

public class Course {
    public String courseId;
    public String courseName;
    public String duration;
    public String fees;
    public String description;

    Course(String courseId,String courseName,String duration,String fees,String description){
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
        this.fees=fees;
        this.description=description;
    }
}
