package com.company.innerclass;

import java.util.HashMap;

class VehicleType {


    interface Vehicle {
        public int getNoOfWheels();
    }

    class Bus implements Vehicle {
        public int getNoOfWheels() {
            return 6;
        }
    }

    class Auto implements Vehicle {
        public int getNoOfWheels() {
            return 3;
        }
    }

}

public class Test4 {

    public static void main(String[] args) {
        VehicleType vehicleType = new VehicleType();
        VehicleType.Vehicle vehicle = vehicleType.new Bus();
        System.out.println(vehicle.getNoOfWheels());

        HashMap map = new HashMap();
        map.put("city","delhi");
    }
}
