package packagebec2;

enum Genre {
    ROCK,
    POP,
    JAZZ
}

public class Record {

    private final String title;
    private final Genre genre;

    public Record(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public Genre getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return title;
    }
}
