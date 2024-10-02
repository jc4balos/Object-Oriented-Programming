package IT2E.vehicle;

import IT2E.components.Engine;

public class Car {
    public String color = "red";
    public int numberOfWheels = 4;
    public double distancedTraveledKm = 170.23;
    public Engine engine;

    public void startEngine() {

        System.out.println("THe car is starting... Broom broom");
    }

    public void printString(String x, int numberOfTimes) {
for(int i = 0; i < numberOfTimes; i++) {
        System.out.println(x);//prints the value
    }
    }

}