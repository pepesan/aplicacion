package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class AlarmClock extends TimePiece{
    // declare and initialize an instance variable
    private  int snoozeInterval;

    // Create an AlarmClock with the default snooze time
    public AlarmClock() {
        //snoozeInterval = 0;
        super();
        setSnoozeInterval(0);

    }
    // Create an AlarmClock with the specified snooze time
    public AlarmClock(int snoozeIn) {
        //setSnoozeInterval(snoozeIn);  // Why do it this way?
        this(snoozeIn,0);
    }
    public AlarmClock(int snoozeIn, long currentIn) {
        setSnoozeInterval(snoozeIn);
        setCurrentTime(currentIn);
    }
    public int getSnoozeInterval() {
        return snoozeInterval;
        // Must return an int
        // Return the instance var's value
    }
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval=snoozeInterval;
    }
    public void setSnoozeInterval(int hour, int minute) {
        snoozeInterval=(60*hour)+minute;
    }
        public void snooze() {
        System.out.println("ZZZZZ");
    }

    @Override
    public void displayCurrentTime() {
        //comentario chorra
        super.displayCurrentTime();
        System.out.println("Tiempo:"+getCurrentTime());
    }

    // Here's a very simple version
    @Override
    public String toString() {
        return "You're set to snooze for: " + snoozeInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlarmClock)) return false;

        AlarmClock that = (AlarmClock) o;

        return ((getSnoozeInterval() == that.getSnoozeInterval())
                && super.equals(that));

    }

    @Override
    public int hashCode() {
        return getSnoozeInterval();
    }
}
