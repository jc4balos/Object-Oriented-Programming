package IT2D;

public class PersonApplication {
    public static void main(String[] args) {
        //created an object
//        Person keni = new Person();
//
//        //printed name atribute
//        System.out.println(keni.name);
//        keni.personInfo();
//        keni.printInput("Baltazar", 21);
//
//        int x = 3;
//        System.out.println(x);
//
//        Bag thisBag = new Bag();
//        System.out.println(thisBag.ballpen);

        int[] x ={1,2,3,4,5,6,7,8,9};
        String[] names = new String[4];
        names[0] = "Mark";
        names[2]="Anthony";
        System.out.println(names[0] + names[2]);

        for(int i =0; i <= names.length; i++){
            System.out.println(names[i]);

        }
    }
}