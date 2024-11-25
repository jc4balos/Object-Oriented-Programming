package IT2C.polymorphism;

public class Animal {
    String sound = "Animal Sound";

    public void makeSound() {
        System.out.println("An animal makes a sound");
    }
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

