package com.company.innerclass;

public class Test1 {

    int a = 20;
    int b = 30;
    static int c = 89;

    public   void display(int x,int y)

    {

        int d =90;
        System.out.println(c);

        class Calculation {

            public void sum(int num1, int num2) {

               // System.out.println("a + b = "+(num1+num2));
                System.out.println(d);
            }
        }
        Calculation cal = new Calculation();
        cal.sum(x,y);

    }
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.display(10,5);
    }
}

