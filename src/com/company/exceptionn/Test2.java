package com.company.exceptionn;

public class Test2 {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("Statement -1");
        //assert (x>10): "x is not gtrter that 10";
        assert (x>10): m2();
        System.out.println("Statement -2");
    }


    public static int m2(){
        return 10;

    }


}
