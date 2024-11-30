package IT2A.polymorphism;

public class  Student extends Person{

    Student(String fullname){
        super(fullname);
    }
    public String returnFullName(){
        return super.fullName;
    }

    //a
    @Override
    public void study() {
        System.out.println("Reviewing");
    }

    //b
    public void study(String subject) {
        System.out.println("Reviewing "+ subject);
    }
}
