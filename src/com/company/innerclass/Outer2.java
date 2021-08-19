package com.company.innerclass;

 class Outer3 {

    static class Nested{
        public static void display(){
            System.out.println("Nested inner class");
        }
    }
}


public class Outer2{
    public static void main(String[] args) {

        Outer3.Nested nested = new Outer3.Nested();
        Outer3.Nested.display();
    }
}
