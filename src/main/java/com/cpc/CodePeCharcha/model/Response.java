package com.cpc.CodePeCharcha.model;

public class Response <T> {
   private T data;
   private String massage ="";

    public Response(T data, String massage) {
        this.data = data;
        this.massage = massage;
    }

    public Response() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
