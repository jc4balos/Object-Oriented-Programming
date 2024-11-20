package IT2D.inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Section: ");
        int section = scn.nextInt();

        Scanner scn2 = new Scanner(System.in);
        System.out.print("Course: ");
        String course = scn2.nextLine();


        Student bal = new Student(section,course);
        bal.printData();



    }
}
