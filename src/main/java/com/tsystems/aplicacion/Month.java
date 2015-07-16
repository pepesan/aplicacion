package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public enum Month {

    JANUARY (31), // calls ctor with 31 ,
    FEBRUARY (28),// calls ctor with 28
    MARCH (31),
    APRIL (30),
    MAY      (31),
    JUNE     (30);

    private final int days;
    // each Month knows its #days
    Month(int daysIn) {  // cannot be public
        days = daysIn;   // enum can't be instantiated directly
    }
    public int days() {
        return days;
    }
}