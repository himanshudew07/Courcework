package com.company.enumm;


enum Month{
    JAN,FEB,MAR,APR
}
public class Test3 {

    public static void main1(String[] args) {
        Month[] months = Month.values();

        for(Month m : months){
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        System.out.println("ordinal "+Month.JAN.ordinal());
    }
}
