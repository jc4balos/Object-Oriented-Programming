package IT2B.Polymorphism;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
        System.out.println("A dog is initialized");
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Arf arf");
    }

    public String getAnimalName() {
        return  super.name;
    }
}
