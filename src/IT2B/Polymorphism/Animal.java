package IT2B.Polymorphism;

public class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        System.out.println("An animal object is initialized");
        this.name= name;
    }
    public void makeSound() {
        System.out.println("An animal makes a sound. Sabi asan na ang allowance?");
    }
}
