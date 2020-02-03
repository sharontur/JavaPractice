package Objects;
public class Book {
    private String name, author;
    private int pages;

    public Book(String n, String a, int p) {
        name = n;
        author = a;
        pages = p;
    }

    public Book(Book other) {
        name = other.name;
        author = other.author;
        pages = other.pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return name + ", by " + author + ", " + pages;
    }
}