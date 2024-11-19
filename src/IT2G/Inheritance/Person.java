package IT2G.Inheritance;

public class Person extends Organism{
    private String name;
    private int age;
    private String address;


    public String getName() {
        return "This is the name of this person: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
