package com.company.enumm;

enum Colors{
    BLUE,RED{

        public void getInfo(){
            System.out.println("dangeor color");
        }
    },GREEN;
    public void getInfo(){
        System.out.println("Universal color");
    }
}
public class Test4 {

    public static void main(String[] args) {
        Colors[] colors = Colors.values();

        for (Colors colors1 : colors){
            colors1.getInfo();
        }
    }
}
