package IT2H.others;

public class Main {
    public static void main(String[] args){
        Animal.walk();
        System.out.println(Animal.name);

    }

}

class Animal {
    public static String name = "Robert";


    public static void  walk() {
        System.out.println("An animal wallks");
    }

}