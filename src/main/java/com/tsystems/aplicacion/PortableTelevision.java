package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class PortableTelevision extends Television{
    private int rechargeLevel;

    public int getRechargeLevel() {
        return rechargeLevel;
    }

    public void setRechargeLevel(int rechargeLevel) {
        this.rechargeLevel = rechargeLevel;
    }

    @Override
    public String toString() {
        return "PortableTelevision{" +
                "rechargeLevel=" + rechargeLevel +
                ","+super.toString()+"}";
    }
}
