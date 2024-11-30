package IT2D.abstraction;

public abstract class Animal {
    abstract void eat(); //abstract method

    //concrete method
    public void walk(int numberOfSteps){
        System.out.println("This animal took " + numberOfSteps +" steps");
    }
}
