package IT2H.inheritance;


public class Dog extends Animal {

    //Create a program that will show dynamic and static polymorphism

    @Override
    public void makeSound() {
        System.out.println("Aw aw");
    }

    public void makeSound(String sound, int numberOfTimesToPrintTheSoundOfTheAnimal){
        for(int i = 0; i < numberOfTimesToPrintTheSoundOfTheAnimal;i++){
            System.out.println(sound);
        }
    }
    public void makeSound(String sound) {
        System.out.println(sound);
    }
}
