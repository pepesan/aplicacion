package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by pepesan on 16/7/15.
 */
public class TelevisionTest {
    Television tele;
    @Before
    public void setUp(){
        tele=new Television();
    }

    @Test
    public void volumenCorrectoAlIniciar(){
        assertEquals(0,tele.getVolume());
    }
    @Test
    public void volumenCorrectoAlIniciar2() {
        assertThat(tele.getVolume(), is(0));
    }
    @Test
    public void brandCorrectoAlIniciar(){
        assertNotNull(tele.getBrand());
    }

    @Test
    public void volumenCorrectoAlCambiarlo(){
        tele.setVolume(2);
        assertEquals(2, tele.getVolume());
    }
    @Test
    public void brandCorrectoAlCambiarlo(){
        tele.setBrand("LG");
        assertEquals("LG", tele.getBrand());
    }

    @Test
    public void dameMarcaYVolumen(){
        assertEquals(":0",tele.dameMarcaYVolumen());
    }
    @Test
    public void dameMarcaYVolumenConDatos(){
        tele.setBrand("LG");
        tele.setVolume(2);
        assertEquals("LG:2",tele.dameMarcaYVolumen());
    }

    @Test
    public void compruebaToString() {
        assertThat(tele.toString(), is("Television{brand='', volume=0}"));
    }
    @Test
    public void compruebaToStringConDatos(){
        tele.setBrand("LG");
        tele.setVolume(2);
        assertThat(tele.toString(), is("Television{brand='LG', volume=2}"));
    }

    @Test
    public void compruebaContructorConParametros(){
        tele= new Television(10, "LG");
        assertThat(tele.getVolume(), is(10));
        assertThat(tele.getBrand(),is("LG"));
    }
    @Test
    public void compruebaConstantes(){
        assertThat(Television.MAX_VOLUME,is(100));
        assertThat(Television.MIN_VOLUME,is(0));
    }

    @Test
    public void pruebaQueSetterVolumeEncajaEntreValores(){
        tele.setVolume(110);
        Boolean ret;
        if(tele.getVolume()>=0 && tele.getVolume()<=100){
            ret=true;
        }else{
            ret=false;
        }
        assertThat(ret,is(true));
    }
    @Test
    public void pruebaQueSetterVolumeEncajaEntreValoresNegativos(){
        tele.setVolume(-10);
        Boolean ret;
        if(tele.getVolume()>=0 && tele.getVolume()<=100){
            ret=true;
        }else{
            ret=false;
        }
        assertThat(ret,is(true));
    }
}
