package IT2A.inheritance;

public class Vehicle {
    double length;
    public String color;
    int numberOfWheels;

    public Vehicle () {}

    public Vehicle (double length,String color,int numberOfWheels) {
        this.length = length;
        this.color = color;
        this.numberOfWheels=numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
