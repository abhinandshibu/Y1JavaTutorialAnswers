package package845d;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Bookshelf implements BookshelfInterface {

    private List<Book> books;

    public Bookshelf(List<Book> books) {
        this.books = new LinkedList<>(books);
    }

    public Bookshelf() {
        this.books = new LinkedList<>();
    }


    @Override
    public int size() {
        return books.size();
    }

    @Override
    public void addBookOnLeftSide(Book b) {
        books.add(0, b);
    }

    @Override
    public void addBookOnRightSide(Book b) {
        books.add(b);
    }

    @Override
    public void addBook(int i, Book b) {
        books.add(i, b);
    }

    @Override
    public Book remove(int i) {
        return books.remove(i);
    }

    @Override
    public void printLeftToRight() {
        books.forEach(System.out::println);
    }

    @Override
    public void printRightToLeft() {
        Stack<Book> stack = new Stack<>();
        stack.addAll(books);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void arrangeDictionariesOnRight(Bookshelf books) {
        int pos = 0;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.remove(pos);
            if (b instanceof Dictionary) {
                books.addBookOnRightSide(b);
            } else {
                books.addBookOnLeftSide(b);
                pos++;
            }
        }
    }

}
