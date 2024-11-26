package IT2B.Polymorphism;

public class Motor {
    //method a
    public void start(){
             System.out.println("buratatatatat");
    }

    //method b
    public void start(String sound) {
        System.out.println(sound);
    }

    public void start(String sound, int numberOfTimes){
        for(int i = 0; i < numberOfTimes;i++){
            System.out.println(sound);
        }
    }
}
