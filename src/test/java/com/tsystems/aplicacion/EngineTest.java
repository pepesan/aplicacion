package com.tsystems.aplicacion;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by pepesan on 17/7/15.
 */
public class EngineTest {
    private Engine motor;

    @Before
    public void setUp(){
        motor=new Engine();
    }

    @Test
    public void compruebaContructor(){
        assertThat(motor,is(notNullValue()));

    }
}
