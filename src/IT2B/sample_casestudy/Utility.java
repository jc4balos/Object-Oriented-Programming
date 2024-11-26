package IT2B.sample_casestudy;

import java.util.Scanner;

public class Utility {
    public static void addBook(String title){

        Book book1 = new Book(title);
        Database.bookDb.add(book1);


        for(int i = 0; i < Database.bookDb.size();i++) {
            System.out.println(Database.bookDb.get(i).getTitle());
        }
    }
}
