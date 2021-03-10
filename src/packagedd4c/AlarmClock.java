package packagedd4c;

public class AlarmClock extends Clock {

    private int alarmTime;
    private boolean alarmSounding = false;
    private int alarmTimeRemaining = 0;

    public AlarmClock(int secondsSinceMidnight, int alarmTime) {
        super(secondsSinceMidnight);
        this.alarmTime = alarmTime;
    }

    @Override
    public void tick() {
        if (isAlarmSounding()) {
            if (alarmTimeRemaining <= 0) {
                alarmSounding = false;
            } else {
                alarmTimeRemaining--;
            }
        }

        super.tick();
        if (super.getSecondsSinceMidnight() == alarmTime) {
            alarmSounding = true;
            alarmTimeRemaining = 60;
        }
    }

    protected boolean isAlarmSounding() {
        return alarmSounding;
    }

    @Override
    public String toString() {
        return super.toString() + (alarmSounding ? " BEEP!" : "");
    }
}
