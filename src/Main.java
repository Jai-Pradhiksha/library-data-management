class LibraryItem {
    private int id;
    private String title;
    private int year;

    public LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Magazine extends LibraryItem {
    private int issue;

    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book(100, "Harry Potter", 2006, "J.K Rowling");
        Magazine magazine = new Magazine(200, "Science fiction", 2020, 10);

        System.out.println("Book - Id: " + book.getId() + ", Title: " + book.getTitle() +
                ", Year: " + book.getYear() + ", Author: " + book.getAuthor());

        System.out.println("Magazine - Id: " + magazine.getId() + ", Title: " + magazine.getTitle() +
                ", Year: " + magazine.getYear() + ", Issue: " + magazine.getIssue());
    }
}
