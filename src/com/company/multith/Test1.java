package com.company.multith;


class Mythread extends Thread {
    int j = 90;
    public void display(){
        System.out.println("Mythread display method called "+j);
    }
    @Override
    public void run() {

        j = 80;
        System.out.println("Mythread run method");
        System.out.println("This Thread name : "+this.getName());
        Thread t =  Thread.currentThread();
        System.out.println("Current thread name  "+t.getName());
        Mythread mythread = (Mythread) t;
        mythread.display();
    }


}
public class Test1 {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();

       // mythread.start();
    }
}
