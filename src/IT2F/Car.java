package IT2F;

public class Car {
    //attribute
    public String color="pink";

    //method
    public void start(String message, int numberOfTimes){
        for(int i= 1; i <=numberOfTimes;i++){
            System.out.println(message);
        }
    }

}
