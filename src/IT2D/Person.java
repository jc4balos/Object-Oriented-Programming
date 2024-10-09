package IT2D;

public class Person {
    public String name;
    public int age;
    public String color;
    public String address;
    public Bag personBag;

//    public void personInfo(){
//        System.out.println("name: "+name +" age: " + age+ " color: " + color);
//    }

    public Person(String inputName, int inputAge){
        this.name=inputName;
        this.age=inputAge;
        System.out.println(age+ name);
    }
////return type/ data type
//    public void printInput(String inputName, int inputAge){
//        //method with parameter
//        System.out.println(inputName + " " + inputAge);
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public String getBagBallpen() {
//        return personBag.getBallpen();
//    }




}
