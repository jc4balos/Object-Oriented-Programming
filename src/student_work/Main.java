package student_work;

/**
 * Ang package na ito ay ginamit
 * ng mga nakihiram ng laptop habang nagaactivity :)
 */

public class Main {
    public static void main(String[] args ){
        Sapatos MyObject = new Sapatos("Sapatusin kita jan");
        MyObject.printAttribute();
        System.out.println(MyObject.name);

    }
}
 class Sapatos{
    public String name;
    public Sapatos(String attribute) {
        this.name = attribute;
    }
    public void printAttribute(){
    System.out.println("The Value of the attributes is:" + this.name);
    }
}





