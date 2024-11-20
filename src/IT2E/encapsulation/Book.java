package IT2E.encapsulation;

public class Book {
    private String title;
    private String author;
    private int numberOfBook;
    private String publisher;

    public Book(String title, String author, int numberOfBook, String publisher) {
        this.title = title;
        this.author = author;
        this.numberOfBook = numberOfBook;
        this.publisher = publisher;
    }
     public void displayBookInfo() {
        System.out.println("Title: " +title);
        System.out.println("Author: "+author);
        System.out.println("Number of Books: "+ numberOfBook);
        System.out.println("Publisher: "+ publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
