package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pepesan on 17/7/15.
 */
public class TunerTest {
    private Tuner tuner;

    @Before
    public void setUp() {
        tuner = new Tuner();
    }

    @Test
    public void pruebaConstructorVacio(){
        assertThat(tuner,notNullValue());
        assertThat(tuner.getChannel(),is(""));
    }
    @Test
    public void pruebaConstructorConCanal(){
        tuner=new Tuner("La Sexta");
        assertThat(tuner,notNullValue());

        assertThat(tuner.getChannel(),is("La Sexta"));
    }

    @Test
    public void pruebaGetterYSetter(){
        tuner.setChannel("La Sexta");
        assertThat(tuner.getChannel(),is("La Sexta"));
    }
}