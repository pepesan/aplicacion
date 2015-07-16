package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class AlarmClock {
    // declare and initialize an instance variable
    private  int snoozeInterval;
    private long currentTime = 0;
    // Create an AlarmClock with the default snooze time
    public AlarmClock() {
        //snoozeInterval = 0;
        this(0);
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
    // Here's a very simple version
    @Override
    public String toString() {
        return "You're set to snooze for: " + snoozeInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarmClock that = (AlarmClock) o;

        if (snoozeInterval != that.snoozeInterval) return false;
        return currentTime == that.currentTime;

    }

    @Override
    public int hashCode() {
        int result = snoozeInterval;
        result = 31 * result + (int) (currentTime ^ (currentTime >>> 32));
        return result;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }
}
