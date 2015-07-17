package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class Car {
    private Engine motor;
    private Transmission trans;

    public Car() {
        this(new Engine(),new Transmission());
    }

    //TODO: probar el constructor
    public Car(Engine motor, Transmission trans) {
        this.motor = motor;
        this.trans = trans;
    }
    //TODO: probar los getter y setters
    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public Transmission getTrans() {
        return trans;
    }

    public void setTrans(Transmission trans) {
        this.trans = trans;
    }

    public void moveTo(String destination) {
        // delegate work to Engine and Transmission
        motor.start(); // engine on previous slide
        motor.rev();
        trans.shiftTo(1); // tranny on previous slide
        trans.engage();
    }
}
