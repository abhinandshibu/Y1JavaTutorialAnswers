package packagedd4c;

public class RadioAlarmClock extends AlarmClock {

    private RadioStation radioStation;

    public RadioAlarmClock(int secondsSinceMidnight, int alarmTime, RadioStation radioStation) {
        super(secondsSinceMidnight, alarmTime);
        this.radioStation = radioStation;
    }

    @Override
    public String toString() {
        return super.toString() + (super.isAlarmSounding() ? radioStation : "");
    }

}
