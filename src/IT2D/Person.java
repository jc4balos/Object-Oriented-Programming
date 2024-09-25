package IT2D;

public class Person {
    public String name="kaye";
    public int age= 19;
    public String color= "pink";
    public String address;
    public Bag personBag;

    public void personInfo(){
        System.out.println("name: "+name +" age: " + age+ " color: " + color);
    }

//return type/ data type
    public void printInput(String inputName, int inputAge){
        //method with parameter
        System.out.println(inputName + " " + inputAge);
    }

    public int getAge(){
        return age;
    }

    public String getBagBallpen() {
        return personBag.getBallpen();
    }




}
