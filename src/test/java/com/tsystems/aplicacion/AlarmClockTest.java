package com.tsystems.aplicacion;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pepesan on 17/7/15.
 */
public class AlarmClockTest {
    private AlarmClock despertador;

    @Before
    public void setUp(){
        despertador=new AlarmClock();
    }
    @Test
    public void pruebaComparacion(){
        despertador.setSnoozeInterval(1000);
        despertador.setCurrentTime(2000);
        AlarmClock despierta=new AlarmClock();
        despierta.setSnoozeInterval(1000);
        despierta.setCurrentTime(2000);
        assertThat(despertador.equals(despierta),is(true));
    }

    @Test
    public void pruebaCurrentTime(){
        despertador.setCurrentTime(200);
        assertThat(despertador.getCurrentTime(),is(200L));

    }
    @Test
    public void pruebaCurrentTimePadre(){
        despertador.setCurrentTime(200);
        despertador.displayCurrentTime();
        assertThat(despertador.getCurrentTime(),is(200L));

    }

}
