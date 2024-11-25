package IT2E.inheritance;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Arf");
    }

    public void makeSound(String sound) {
        System.out.println(sound);
    }

    public void makeSound(String sound, int numberOfTimes){
        if (numberOfTimes> 5){
            System.out.println("Pagod ang aso");
        }else{
            for(int i = 0; i < numberOfTimes; i++) {
                System.out.println(sound);
            }
        }

    }
}
