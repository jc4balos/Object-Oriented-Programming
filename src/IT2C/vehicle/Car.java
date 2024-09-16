package IT2C.vehicle;

public class Car {

    public int doorAmount=4;
    public String color ="red";

    public void start(String sound, int numberOfTimes){
        //Implementation
        for(int i=0;i < numberOfTimes; i++ ){
            System.out.println(sound);
        }
    }
}