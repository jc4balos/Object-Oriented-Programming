package IT2B.inheritance;

public class Person {
   public String name = "George";
   private int age;
   private String sex;

   public Person(){
      //Empty Constructor
   }
   public Person(String name, int age, String sex){
      this.name = name;
      this.age = age;
      this.sex = sex;
   }
  public String getName(){
      return name;
  }
  public void setName(String name) {
      this.name = name;
   }
}
