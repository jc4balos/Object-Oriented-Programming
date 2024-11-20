package IT2C.Encapsulation;
public class User {

    public String username = "jcabalos";
    private String password = "secret";

    public void printData() {
        System.out.println(getUsername()+ " " + getPassword());
    }

    private String getUsername() {
        return this.username;
    }

    private String getPassword() {
        return this.password;
    }
}
