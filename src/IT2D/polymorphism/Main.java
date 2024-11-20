package IT2D.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal d = new Animal();
        d.makeSound();

    }
}

class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }

    void makeSound(String sound){
        System.out.println(sound);
    }

    void makeSound(String sound, int numberOfTimes){
        for(int i=1 ; i < numberOfTimes;i++){
            System.out.println(sound);
        }
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
