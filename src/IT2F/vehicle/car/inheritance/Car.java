package IT2F.vehicle.car.inheritance;

public class Car extends Vehicle{
    //method a
    public void start(){
        System.out.println("Broom broom");
    }

    //method b
    public void start(String sound) {
        System.out.println(sound);
    }

    //method c
    public void start(String sound, int numberOfSound){
        for(int i = 0; i < numberOfSound; i++) {
            System.out.println(sound);
        }
    }
}
