package IT2D.person;

public class PersonApplication {
    public static void main(String[] args) {
        //Created an object of Person
       Person jonathan = new Person("joelPogi","paldo"); //create a person object
       //Changed the username through setUsername method
        jonathan.setUsername("ramilPogi");
        //Get the value of username
        String uname = jonathan.getUsername();
        //print the value of username
        System.out.println(uname);

        jonathan.printDetails();
        jonathan.printDetails();
        jonathan.printDetails();
        jonathan.printDetails();
        jonathan.printDetails();
        jonathan.printDetails();



    }
}
