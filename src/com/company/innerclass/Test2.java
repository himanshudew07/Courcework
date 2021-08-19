package com.company.innerclass;

class Cal{
    Cal(int a){

    }
    public void display(){
        System.out.println("Sum operations");
    }
}
public class Test2 {

    static Cal c = new Cal(5){
        @Override
        public void display() {
            super.display();
        }
    };
    public static void main(String[] args) {



    }
}
