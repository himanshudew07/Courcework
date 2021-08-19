package com.company.anno;


public class Student {

    public Student(String name, int rollnumber, int age) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.age = age;
    }

    String name ;
    int rollnumber;
    int age;

    @Cource(id=124,cname="Mathes")
    public void getDetails(){

        System.out.println("------------Student details-----------");
        System.out.println("Roll Number : "+rollnumber);
        System.out.println("Name  : "+name);
        System.out.println("Age : "+age);

    }

}
