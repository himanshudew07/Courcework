package com.company.multith;

import com.company.Main;

public class Test2 {


    public static void main(String[] args) {
        CustThread mt = new CustThread();
        mt.start();

        System.out.println("main thread created new Thread");
       // mt.interrupt();
    }
}

class CustThread extends  Thread{
    @Override
    public void run() {
        try{
            for (int i=0;i<100;i++) {
                System.out.println("child thread "+i);
                if(interrupted()){
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        }catch (Exception e){
            System.out.println("catch thread is "+e.getMessage());

        }
    }
}
