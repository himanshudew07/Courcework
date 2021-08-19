package com.company.exceptionn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) {
      //  m1();
    }

    public static void m1() throws Exception{
        PrintWriter out=new PrintWriter("abc.txt");
        out.println("hello");
    }
}
