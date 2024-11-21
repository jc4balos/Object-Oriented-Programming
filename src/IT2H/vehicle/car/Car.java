package IT2H.vehicle.car;

public class Car {
    private float distanceTraveledKm =0;
    private int numberOfDoors;

    public Car(float distanceTraveled, int doors){
        //changed the values of attributes
        this.distanceTraveledKm = distanceTraveled;
        this.numberOfDoors=doors;
        //printed object is created
        System.out.println("An Object of Car is created");
        drive(10F);
    }

     private void drive(float distanceTraveled) {
        this.distanceTraveledKm = this.distanceTraveledKm + distanceTraveled;
    }

    public float getDistanceTraveledKm(){
        return distanceTraveledKm;
    }

}
