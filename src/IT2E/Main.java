package IT2E;

import IT2E.vehicle.Car;

public class Main {

    public static  void  main(String[] args){

        //create an instance of an object
        Car lamborghini = new Car();
        //called the start method
        lamborghini.startEngine();
        lamborghini.printString("Hello World");
        System.out.println(lamborghini.color);
    }
}