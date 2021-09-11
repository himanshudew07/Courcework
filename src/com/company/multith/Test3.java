package com.company.multith;

public class Test3 {

    public static void main(String[] args) {

        VanueFixing vf = new VanueFixing();
        CardPrining cp = new CardPrining(vf);
        CardDistributer cd = new CardDistributer(cp);
        vf.start();
        cp.start();
        cd.start();

    }

}

class VanueFixing extends Thread{
    @Override
    public void run() {
        fixValnue();
    }

    public void fixValnue(){
        try {
            System.out.println("start value fixing");
            Thread.sleep(30000);
            System.out.println("Fixed value : Bilaspur");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

class CardPrining extends Thread{
    Thread t;
    CardPrining(Thread t){
        this.t = t;
    }
    @Override
    public void run() {
        fixValnue();
    }

    public void fixValnue(){
        try {
            System.out.println("Front page printed");
            System.out.println("Second page printed");
            t.join(10000);
            System.out.println("Vanue printed");
            System.out.println("Card printing finished..");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

class CardDistributer extends Thread{
    Thread t;
    CardDistributer (Thread t){
        this.t = t;
    }
    @Override
    public void run() {
        carddistributer();
    }

    public void carddistributer(){
        try {
            System.out.println("Preparing guest name");
            t.join();
            Thread.yield();
            System.out.println("Wrinting guestname on card");
            System.out.println("Distrubute card");
            System.out.println("Distributed all card ....");

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
