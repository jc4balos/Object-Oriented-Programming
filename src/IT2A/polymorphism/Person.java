package IT2A.polymorphism;

public class Person {

    String fullName;

    Person(){
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    String getName() {
        System.out.println("Name");
        return "Name";
    }

    void study() {
        System.out.println("This Person is studying...");
    }
}
