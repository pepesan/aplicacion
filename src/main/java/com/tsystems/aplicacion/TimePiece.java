package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class TimePiece {
    private long currentTime;

    public TimePiece() {
        this(0);
    }
    public TimePiece(long d) {
        currentTime = d;
    }
    public void displayCurrentTime() {
        System.out.println(currentTime);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimePiece)) return false;

        TimePiece timePiece = (TimePiece) o;

        return getCurrentTime() == timePiece.getCurrentTime();

    }

    @Override
    public int hashCode() {
        return (int) (getCurrentTime() ^ (getCurrentTime() >>> 32));
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }
}
