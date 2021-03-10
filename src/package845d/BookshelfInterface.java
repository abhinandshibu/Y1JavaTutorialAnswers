package package845d;

public interface BookshelfInterface {

    // Returns the number of books on the bookshelf
    int size();

    // Adds a book on the left side of the shelf.
    // Shifts all other books one position to the right
    void addBookOnLeftSide(Book b);

    // Adds a book on the right side of the shelf.
    void addBookOnRightSide(Book b);

    // Adds book in position i counting from the left, starting
    // from zero, and shifts all other books one position to the right.
    // Hence addBook(0, b) is equivalent to addBookOnLeftSide(b), and
    // addBook(size(), b) is equivalent to addBookOnRightSide(b)
    void addBook(int i, Book b);

    // Removes book from position i, shifting all books with position
    // greater than i to the left
    Book remove(int i);

    // Prints all details of books from left to right
    void printLeftToRight();

    // Prints all details of books from right to left
    void printRightToLeft();

}
