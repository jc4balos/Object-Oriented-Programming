package IT2H;

import IT2H.vehicle.Car;

public class Main {

    public static void main(String[] args) {
        //Created an object instance
        Car redCar = new Car();

        //Called an attribute
        System.out.println(redCar.distanceTraveledKm);

        //Called a method
        String carSound = redCar.start("hahahahaha");
        System.out.println(carSound);


    }

}