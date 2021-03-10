package packagedd4c;

public class Clock {

    private int secondsSinceMidnight;

    public Clock(int secondsSinceMidnight) {
        this.secondsSinceMidnight = secondsSinceMidnight;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.secondsSinceMidnight = hours * 3600 + minutes * 60 + seconds;
    }

    public void tick() {
        secondsSinceMidnight++;
    }

    protected int getSecondsSinceMidnight() {
        return secondsSinceMidnight;
    }

    @Override
    public String toString() {
        int hours = secondsSinceMidnight / 3600;
        int minutes = (secondsSinceMidnight % 3600) / 60;
        int seconds = (secondsSinceMidnight % 3600) % 60;
        return "Time is: " + hours + ":" + minutes + ":" + seconds;
    }

}
