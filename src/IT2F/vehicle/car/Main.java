package IT2F.vehicle.car;

import IT2F.vehicle.car.engine.Engine;
import IT2F.vehicle.car.inheritance.Car;
public class Main {

    public static void main(String[] args){
        Car car = new Car();
        car.setColor("red");
        car.setNumberOfDoors(2);
        car.setNumberOfWheels(5);
        car.displayInfo();
        car.setName("Lamborghini");
        System.out.println(car.name);

    }
}
