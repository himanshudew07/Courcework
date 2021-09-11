package com.company.multith;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant1 {

    public static void main(String[] args) {
        RThread rt1 = new RThread("rt1");
        RThread rt2= new RThread("rt2");

        rt1.start();
        rt2.start();

    }
}


 class RThread extends  Thread{
    static ReentrantLock reentrantLock = new ReentrantLock();
    RThread(String name){
        super(name);
    }
    @Override
    public void run() {
        try {

             //reentrantLock.lock();

           // if(reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                if(true){
                System.out.println("RThread by " + Thread.currentThread().getName());
                Thread.sleep(15000);

                reentrantLock.unlock();
            }else {
                System.out.println("Alternate operation performaed");
            }


        }catch (Exception e){

        }
    }
}
