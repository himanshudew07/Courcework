package com.company.oops;

class Parent{

    public  static  void  m(){
        System.out.println("Method Parent");
    }
}

class Child extends Parent{

    public static void m(){
        System.out.println("Method Child");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.m();

    }
}
