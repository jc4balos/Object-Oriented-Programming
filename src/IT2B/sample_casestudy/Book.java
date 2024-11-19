package IT2B.sample_casestudy;

import java.time.LocalDate;

public class Book {
    private String author;
//    private LocalDate datePublished;
    private String title;
    private String publisher;
    private String genre;
    private int numberOfPages;

    public Book(String author, String title, String publisher, String genre, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void printBookData() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Genre: "+ genre);
        System.out.println("Pages: " + numberOfPages);

    }
}
