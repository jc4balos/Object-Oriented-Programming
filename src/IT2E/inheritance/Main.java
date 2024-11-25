package IT2E.inheritance;

public class Main {
    public static void main(String[] args){
        Dog dog =new Dog();
//        dog.setAnimalColor("Red");
//        System.out.println(dog.getAnimalColor());
//        System.out.println(dog.animalColor);
        dog.makeSound("Woof");
        dog.makeSound();
        dog.makeSound("Woof", 10);

        //Dynamic Polymorphism
        Animal dog2 = new Animal();
        dog2.makeSound();
    }
}
