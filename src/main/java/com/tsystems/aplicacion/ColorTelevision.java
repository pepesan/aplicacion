package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class ColorTelevision extends Television{
    private int colorTint;

    public int getColorTint() {
        return colorTint;
    }

    public void setColorTint(int colorTint) {
        this.colorTint = colorTint;
    }

    @Override
    public String toString() {
        return "ColorTelevision{" +
                "colorTint=" + colorTint +
                ","+super.toString()+"}";
    }
}
