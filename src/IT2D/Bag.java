package IT2D;

import IT2D.inheritance.Person;

public class Bag {
    public static String ballpen = "Pilot";

    public static String getBallpen(){
            return ballpen;
    }

    public void setBallpen(String pen) {
        this.ballpen = pen;
    }


    public static class Student extends Person {
        public String course;
        public int section;

        public Student(int section, String course) {
            this.section = section;
            this.course = course;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getSection() {
            return section;
        }

        public void setSection(int section) {
            this.section = section;
        }

        public void printData() {
            System.out.println(super.name);
            System.out.println(course);
            System.out.println(section);

        }}
}
