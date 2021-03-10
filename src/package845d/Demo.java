package package845d;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Dictionary d1 = new Dictionary(
                "isbn1",
                "title1",
                329,
                "english",
                "french",
                4438);
        Dictionary d2 = new Dictionary(
                "isbn2",
                "title2",
                232,
                "hindi",
                "english",
                5993);
        Book b1 = new Book("isbn3", "title3", 321);
        Book b2 = new Book("isbn4", "title4", 123);
        Book b3 = new Book("isbn5", "title5", 901);
        Book b4 = new Book("isbn6", "title6", 109);

        Bookshelf bookshelf = new Bookshelf(List.of(d1, d2, b1, b2, b3, b4));

        bookshelf.printLeftToRight();
        bookshelf.printRightToLeft();

        Bookshelf.arrangeDictionariesOnRight(bookshelf);
        bookshelf.printLeftToRight();
    }

}
