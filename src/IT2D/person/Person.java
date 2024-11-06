package IT2D.person;


public class Person {
    private String username;
    private String password;


    public void printDetails() {
        System.out.println("Username: " +getUsername() + " Password: " +getPassword());
    }

    public Person(String inputName, String inputPassword) {
        this.username = inputName;
        this.password = inputPassword;
    }

    private String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
}