package IT2E.inheritance;

public class Animal {
     private String animalName;
     private int numberOfLegs;
     protected String animalColor;

     public Animal() {
         //Empty Constructor
     }

     //Create a program that will show Dynamic and Static Polymorphism  

     public void makeSound(){
         System.out.println("An Animal makes a sound");
     }

     public Animal(String animalName,int numberOfLegs, String animalColor){
         this.animalColor = animalColor;
         this.numberOfLegs = numberOfLegs;
         this.animalName = animalName;

     }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
