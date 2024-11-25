package IT2C.polymorphism;

public class Cat extends Animal{

    public String name = "Pussy Cat";

    @Override
    public void makeSound() {
        super.makeSound(super.sound);
//        System.out.println("Meow meow");
    }

//    public void makeSound(String sound) {
//        System.out.println(sound);
//    }

    public void makeSound(String sound, int numberOfTimes){
        for (int i=0; i<= numberOfTimes; i++){
            System.out.println(sound);
        }
    }

}
