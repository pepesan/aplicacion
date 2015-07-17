package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pepesan on 17/7/15.
 */
public class CarTest {
    private Car coche;

    @Before
    public void setUp(){
        coche=new Car();
    }

    @Test
    public void compruebaContructorSinParametros(){
        assertThat(coche,is(notNullValue()));
        assertThat(coche.getMotor(),is(notNullValue()));
        assertThat(coche.getTrans(),is(notNullValue()));
    }

    @Test
    public void compruebaContructorConDosParametros(){
        coche=new Car(null,null);
        assertThat(coche,is(notNullValue()));
        assertThat(coche.getMotor(),is(nullValue()));
        assertThat(coche.getTrans(),is(nullValue()));
    }
}
