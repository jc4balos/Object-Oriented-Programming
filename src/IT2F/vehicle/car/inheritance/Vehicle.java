package IT2F.vehicle.car.inheritance;

public class Vehicle {

    private int numberOfWheels;
    private int numberOfDoors;
    private String color;
    public String name;

    public void setName(String newName) {
        this.name = newName;
    }

    public Vehicle() {}

    public Vehicle(int wheels, int doors, String color){
        this.numberOfDoors = doors;
        this.numberOfWheels = wheels;
        this.color = color;
    }

    public void start(){
        System.out.println("Vehicle is starting... broom broom");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getNumberOfDoors());
        System.out.println(getNumberOfWheels());

    }}
