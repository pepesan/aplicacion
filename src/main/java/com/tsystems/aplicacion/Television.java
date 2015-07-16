package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private String brand;
    private int volume;

    public Television(){
        this(0, "");
    }

    public Television(int volumen, String brand) {
        this.setVolume(volumen);
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume<=100 && volume>=0) {
            this.volume = volume;
        }
    }

    public String dameMarcaYVolumen() {
        return this.brand+":"+this.volume;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
