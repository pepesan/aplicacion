package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pepesan on 17/7/15.
 */
public class TransmissionTest {
    private Transmission trans;

    @Before
    public void setUp(){
        trans=new Transmission();
    }

    @Test
    public void compruebaContructor(){
        assertThat(trans,is(notNullValue()));

    }
}

