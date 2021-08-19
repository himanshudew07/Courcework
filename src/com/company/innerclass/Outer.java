package com.company.innerclass;

 class Outer1 {

     private class Inner{

        final void m1(){

        }

    }
}

public  class Outer{
    public static void main(String[] args) {

        Outer1 outer1 = new Outer1();
       // Outer1.Inner inner = outer1.new Inner();
    }
}


