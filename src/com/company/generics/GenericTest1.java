package com.company.generics;

import java.util.ArrayList;

public class GenericTest1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        GenericTest1.method1(al);
    }

    public static void method1(ArrayList<? extends Number> al){

    }
}
