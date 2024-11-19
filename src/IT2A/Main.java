package IT2A;

import java.util.ArrayList;
import IT2A.Book;

public class Main {

    public static void main(String[] args){

        Book book1 = new Book("The None", "Rachelle Macarayo", false);
        Book book2 = new Book("The Wrong Turn", "Ma. Lourdes Mendez", true);



        ArrayList<Book> db = new ArrayList<>();
        db.add(book1);
        db.add(book2);




    }



}
