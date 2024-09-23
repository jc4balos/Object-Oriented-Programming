package IT2H.vehicle;

public class Car {
    public float distanceTraveledKm =0;
    public int numberOfDoors;

    public Car(float distanceTraveled, int doors){
        //changed the values of attributes
        this.distanceTraveledKm = distanceTraveled;
        this.numberOfDoors=doors;
        //printed object is created
        System.out.println("An Object of Car is created");
    }

    public void drive(float distanceTraveled) {
        this.distanceTraveledKm = this.distanceTraveledKm + distanceTraveled;
    }

}
