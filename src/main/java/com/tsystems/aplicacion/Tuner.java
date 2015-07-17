package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class Tuner {
    private String channel;

    public Tuner() {
        this("");
    }

    public Tuner(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "channel='" + channel + '\'' +
                '}';
    }
}
