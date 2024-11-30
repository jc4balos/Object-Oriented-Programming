package IT2H.abstraction;

public abstract class Animal {
    String name;
    int age ;

    public int getAge(){
        return age;
    }//concrete methods

    abstract void run();//abstract method
}
