package packagebec2;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    private final String name;
    private final Genre mainGenre;
    private final List<Record> catalogue = new ArrayList<>();

    public Artist(String name, Genre mainGenre) {
        this.name = name;
        this.mainGenre = mainGenre;
    }

    public void addRecord(String name) {
        catalogue.add(new Record(name, mainGenre));
    }

    public void addRecord(String name, Genre genre) {
        catalogue.add(new Record(name, genre));
    }

    public void showCatalogue() {
        for (Record r : catalogue) {
            System.out.println(r);
        }
    }

    public void showGenre(Genre genre) {
        for (Record r : catalogue) {
            if (r.getGenre() == genre) {
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        Artist a = new Artist("John", Genre.ROCK);

        a.addRecord("subtle beauty", Genre.JAZZ);
        a.addRecord("why try", Genre.ROCK);
        a.addRecord("life ends");
        a.addRecord("now", Genre.POP);

        a.showCatalogue();
        a.showGenre(Genre.ROCK);
    }

}
