package com.cpc.CodePeCharcha.model;

public class Instructor {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Long adhaarNo;

    public Instructor() {
    }

    public Instructor(int id, String name, String address, String mobile, String email, Long adhaarNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.adhaarNo = adhaarNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(Long adhaarNo) {
        this.adhaarNo = adhaarNo;
    }
}
