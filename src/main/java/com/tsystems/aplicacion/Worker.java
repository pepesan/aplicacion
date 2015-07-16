package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class Worker {
    void sleepMore(AlarmClock clock) {
        // The Worker's family will be surprised!
        // Everyone using the clock will be snoozing
        clock.setSnoozeInterval(5000);
    }
}
