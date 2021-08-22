package com.company.multith;

public class DeadlockDemo {
    public static void main(String[] args) {
        StackObj stack1 = new StackObj();
        StackObj stack2 = new StackObj();
        TestThread tt1 = new TestThread(stack1,stack2);
        TestThread tt2 = new TestThread(stack1,stack2);
        tt1.start();
        tt2.start();

    }
}

class TestThread extends Thread{
    StackObj stack1 ;
    StackObj stack2 ;

   public  TestThread(StackObj stack1,StackObj stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }
    @Override
    public void run() {
        stack1.consume();
        stack2.produce();
    }
}
    class StackObj{
        public synchronized void consume(){
            produce();
        }
        public synchronized void produce(){
            consume();
        }

}
