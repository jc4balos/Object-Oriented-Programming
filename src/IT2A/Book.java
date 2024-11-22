package IT2A;

public class Book {
    public static String title = "Hello Lord";
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author, boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public static void displayInfo() {
        System.out.println("Hello");
    }
}