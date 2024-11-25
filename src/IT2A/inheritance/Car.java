package IT2A.inheritance;

public class Car extends Vehicle{
    public void start() {
        System.out.println("kwskwswksw");
    }

    public void start(int numberOfTimes) {
        for (int i=0; i < numberOfTimes; i++) {
            System.out.println("kwskwswksw");
        }
    }

    public void start(String sound) {
        System.out.println(sound);
    }
}
