package com.company.exceptionn;

public class Test3 {

    public static void main(String[] args) {
        new Test3().display();
    }

    public void display() throws ArrayIndexOutOfBoundsException{
try {
    throw new InterruptedException();
}catch (Exception e){}
    }
}
