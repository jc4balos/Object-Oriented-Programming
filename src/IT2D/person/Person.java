package IT2D.person;


public class Person {
    private String username;
    private String password;


    public Person(String inputName, String inputPassword) {
        this.username = inputName;
        this.password = inputPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
}