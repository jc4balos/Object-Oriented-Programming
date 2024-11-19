package IT2G;


import IT2G.Inheritance.Person;
import IT2G.Inheritance.Teacher;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher(); //created teacher object
        teacher.setName("Jc Abalos");
        teacher.setAge(23);
        teacher.setAddress("Cabanatuan");

        teacher.setSpecies("Homo Sapiens");


        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Name: " + teacher.getName());

        System.out.println("Age: " + teacher.getAge());
        System.out.println("Address: "+ teacher.getAddress());
        System.out.println("Species: "+ teacher.getSpecies());

        Person person1 = new Person();
        person1.setName("Erica");
        System.out.println(person1.getName());

    }


}
