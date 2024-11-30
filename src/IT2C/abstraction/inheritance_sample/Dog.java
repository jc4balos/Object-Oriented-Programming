package IT2C.abstraction.inheritance_sample;


public class Dog implements Animal {
    public void eat(){
        System.out.println("munch");
    }
    public void walk() {
        System.out.println("Dog walks");
    }

    public void walk(int numberOfSteps){
        System.out.println("Dog takes " + numberOfSteps + " steps" );
    }
}
