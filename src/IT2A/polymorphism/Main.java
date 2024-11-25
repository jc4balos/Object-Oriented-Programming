package IT2A.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.makeSound();


    }
}
class Animal {
    void makeSound(){

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Arf Arf");
    }
}
