package com.company.innerclass;


interface Vehicle{

    int getwheels();

    class DefaultVehicle implements Vehicle {

        @Override
        public int getwheels() {
            return 3;
        }
    }
}

public class Test5 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.DefaultVehicle();
        System.out.println("Wheel in default interface = "+vehicle.getwheels());
    }
}
