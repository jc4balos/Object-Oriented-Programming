package IT2D;

public class PersonApplication {
    public static void main(String[] args) {
        //created an object
        Person keni = new Person();

        //printed name atribute
        System.out.println(keni.name);
        keni.personInfo();
        keni.printInput("Baltazar", 21);

        int x = 3;
        System.out.println(x);

        Bag thisBag = new Bag();
        System.out.println(thisBag.ballpen);
    }
}