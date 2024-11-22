package IT2F.vehicle.car.method_overriding;

public class Vehicle {
    private String sound;

    public Vehicle() {

    }
    public Vehicle(String soundParam) {
        this.sound = soundParam;

    }
    public void start() {
        System.out.println("Broom Broom");
    }
}
