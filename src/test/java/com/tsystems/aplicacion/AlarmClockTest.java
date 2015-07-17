package com.tsystems.aplicacion;

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
}
