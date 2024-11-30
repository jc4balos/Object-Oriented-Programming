package IT2C;
import IT2C.polymorphism.Animal;
import IT2C.inheritance.Dog;
import IT2C.inheritance.Lion;
import IT2C.polymorphism.Cat;

public class Main {

    public static void main(String[] args) {
        System.out.println(Printer.name);

    }

}
class Printer {

    static String name = "Shecaina";

    static void print(String sound){
        System.out.println(sound);
    }
}