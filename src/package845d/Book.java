package package845d;

public class Book {

    private final String isbn;
    private String title;
    private int pages;

    public Book(String isbn, String title, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title +
                "\nISBN: " + isbn +
                "\nNo of Pages: " + pages;
    }

}
