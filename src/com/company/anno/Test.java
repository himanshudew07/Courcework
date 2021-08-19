package com.company.anno;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Ramesh",341,37);
        student.getDetails();
        Class c  = student.getClass();

        Cource cource = (Cource)(c.getMethod("getDetails").getAnnotation(Cource.class));


        System.out.println("Cource id "+ cource.id());
        System.out.println("Cource Name "+ cource.cname());



    }
}
