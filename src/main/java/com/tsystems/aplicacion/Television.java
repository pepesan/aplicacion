package com.tsystems.aplicacion;

/**
 * Created by pepesan on 16/7/15.
 */
public class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private String brand;
    private int volume;
    private Boolean muted;
    private int _lastvolume;
    private Tuner tuner;

    public Television(){
        this(0, "RCA");
    }


    public Television(int volumen, String brand) {
        this(volumen,brand,new Tuner());
    }

    public Television(int volumen, String brand,Tuner tuner) {
        this.setVolume(volumen);
        this.setBrand(brand);
        this.muted=false;
        this.setTuner(tuner);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(     brand.equals("RCA") ||
                brand.equals("Hitachi")||
                brand.equals("Zenith")||
                brand.equals("Sony")) {
            this.brand = brand;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume<=100 && volume>=0) {
            this.volume = volume;
            this._lastvolume=volume;
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

    public void mute() {
        this.muted=!this.muted;
        if(this.getMuted()!=false) {
            this.volume=0;
        }else{
            this.volume=this._lastvolume;
        }
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void gotoChannel(String s) {
        getTuner().setChannel(s);
    }

    public String getCurrentChannel() {
        return getTuner().getChannel();
    }
}
