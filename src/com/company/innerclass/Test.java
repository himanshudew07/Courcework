package com.company.innerclass;

class Test
{
    int x=10;
    public void methodOne()
    {
        int y=20;
        class Inner
        {
             void methodTwo()
            {
                System.out.println(x);//10
                System.out.println(y); //C.E: local variable y

            }
        }
        Inner i=new Inner();
        i.methodTwo();
    }
    public static void main(String[] args)
    {
        new Test().methodOne();
    }
}
