package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class AlarmClock {
    // declare and initialize an instance variable
    private  int snoozeInterval = 5;

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
}
