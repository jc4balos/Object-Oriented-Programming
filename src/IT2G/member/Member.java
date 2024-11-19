package IT2G.member;

 public class Member {
    private String memberName;
    private int age;
    private String password;

    public int getAge() {
        return age;
    }

    public void setPassword(String newPass){
        this.password = newPass;
    }

    public void printMemberName() {
        System.out.println("Name: 123" + memberName);

    }

    public void run() {
        printMemberName();
    }
    public Member(String name , int age, String password) {
        this.memberName = name;
        this.age =  age;
        this.password = password;
    }

}
