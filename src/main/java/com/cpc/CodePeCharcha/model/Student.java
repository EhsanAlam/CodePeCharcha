package com.cpc.CodePeCharcha.model;

public class Student {
    private String studentId;
    private String studentName;
    private String dateOfBirth;
    private int mobileNo;
    private String emailId;
    private String address;

    public Student() {
    }

    public Student(String studentId,String studentName, String dateOfBirth, int mobileNo,String emailId, String address) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.dateOfBirth=dateOfBirth;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.address = address;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}