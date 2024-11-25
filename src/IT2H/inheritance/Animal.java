package IT2H.inheritance;

public class Animal {
    public String color;
    private  String name;
    private String breed;

    public void makeSound() {
        System.out.println("An Animal makes a sound");
    }

    public Animal(){
        //Empty Constructor
    }

    public Animal(String colorParam, String nameParam, String breedParam){
        this.color = colorParam;
        this.name = nameParam;
        this.breed = breedParam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
