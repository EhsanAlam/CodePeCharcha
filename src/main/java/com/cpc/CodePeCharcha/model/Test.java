package com.cpc.CodePeCharcha.model;


public class Test {
    String dbName ="CPC";
//    int m1();
    static void m4(){
        System.out.println("Static method of interface");
    }

}
class TestImp extends Test{
    static void m4(){
        System.out.println("Static method of implementation class");
    }
    public int m1() {

        String db = dbName;
        return 0;
    }

}

class Main{
    public void t1(){
        Test t = new TestImp();
        t.m4();
    }
}