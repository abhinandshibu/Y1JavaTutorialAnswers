package packagedd4c;

public enum RadioStation {

    BBC("hello world"),
    HEART("this is heart");

    private final String message;

    RadioStation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
