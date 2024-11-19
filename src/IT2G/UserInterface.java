package IT2G;

import java.util.Scanner;
public class UserInterface {

    public static void showHome() {
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        if (input == 1){
            System.out.println("Enter the book title:");
            String bookTitle = scn.nextLine();
            System.out.println("Enter the book author:");
            String bookAuthor = scn.nextLine();
            Book newBook = new Book(bookTitle, bookAuthor, false);
            Database.books.add(newBook);
        }



    }

}
