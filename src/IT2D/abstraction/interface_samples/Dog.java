package IT2D.abstraction.interface_samples;

//Rectitation:

//Create a program that will show Abstraction using abstract
//classes and interfaces


public class Dog implements Animal{
    public void eat() {
        System.out.print("Banana");

    }
    public void run() {
        System.out.print("fast");
    }

    public void run(int numberOfSteps) {
        if (numberOfSteps > 60) {
            System.out.print("fast");
        } else {
            System.out.print("slow");
        }
    }
        public void walk() {
            System.out.print("fast");
        }

    public void dance() {
        System.out.print("dancing");
    }
}


