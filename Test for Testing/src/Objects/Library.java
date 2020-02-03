package Objects;
public class Library {
    private Book[] books;
    private int numOfBooks;
    private final int MAX_BOOKS = 100;

    public Library() {
        books = new Book[MAX_BOOKS];
        numOfBooks = 0;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public boolean addBook(Book b) {
        if (numOfBooks == MAX_BOOKS) {
            return false;
        } else {
            books[numOfBooks] = new Book(b);
            numOfBooks++;
            return true;
        }
    }

    public Book getByBookName(String bName) {
        for (int i = 0; books[i] != null; i++) {
            if (bName.equals(books[i].getName())) {
                return new Book(books[i]);
            }
        }
        return null;
    }

    public int countAuthor(String author) {
        int count = 0;
        for (int i = 0; books[i] != null; i++) {
            if (author.equals(books[i].getAuthor())) {
                count++;
            }

        }
        return count;
    }

    public Book maxPagesBook() {
        int max = 0;
        int position = 0;
        for (int i = 0; books[i] != null; i++) {
            if (books[i].getPages() > max) {
                max = books[i].getPages();
                position = i;
            }
        }
        if (books[position] != null) {
            return new Book(books[position]);
        } else {
            return null;
        }
    }

    public String toString() {
        String book = "";
        for (int i = 0; books[i] != null; i++) {
            book += books[i].toString() + "\n";

        }
        return "Total books in library: " + numOfBooks + "\n" + book;

    }

    public static void main(String[] args){
        Library library = new Library();
        Book b1 = new Book("Mula Potter", "JK muleing", 539);
        Book b2 = new Book("Gone With the Mule", "Fozizo Fozizi", 115);
        Book b3 = new Book("Aharoni Mevashel", "Aharoni", 431);
        Book b4 = new Book("Bobi", "Muleina", 11);
        Book b5 = new Book("Mule is cute", "Sharon Turner", 666);
        Book b6 = new Book("The Great Mule", "Fozizo Fozizi", 28);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);

        System.out.println(library.maxPagesBook());
        System.out.println(library.countAuthor("Fozizo Fozizi"));
        System.out.println(library.getByBookName("Bobi"));
        System.out.println(library.getByBookName("Godidi"));
        System.out.println(library.toString());





    }
}