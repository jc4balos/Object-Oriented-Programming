package IT2B.sample_casestudy;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        while(true) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter Title: ");
            String title = scn.nextLine();
            Utility.addBook(title);
        }
     }
}
