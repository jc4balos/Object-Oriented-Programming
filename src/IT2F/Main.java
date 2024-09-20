package IT2F;

public class Main {

    public static void main(String[] args){

        Car myCar= new Car(); //created an object
        String colorMyCar = myCar.color; // called color from myCar object
        //stored on colorMyCar=

        System.out.println(colorMyCar); //printed on console
        myCar.start("Sasama ako sa aquaintance",5);

    }
}
