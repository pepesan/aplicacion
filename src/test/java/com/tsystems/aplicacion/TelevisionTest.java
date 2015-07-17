package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static  org.junit.Assert.*;

/**
 * Created by pepesan on 16/7/15.
 */
public class TelevisionTest {
    /**
     * Inicializo un objeto con el constructor sin params
     */
    Television tele;
    @Before
    public void setUp(){
        //se inicializa con un const. sin params
        tele=new Television();
    }

    @Test
    public void volumenCorrectoAlIniciar(){
        assertEquals(0,tele.getVolume());
    }
    @Test
    public void mutedCorrectoAlIniciar(){
        assertThat(tele.getMuted(), is(false));
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
    public void mutedCorrectoAlCambiarlo(){
        tele.setMuted(true);
        assertThat(tele.getMuted(), is(true));
    }
    @Test
    public void brandCorrectoAlCambiarlo(){
        tele.setBrand("Sony");
        assertEquals("Sony", tele.getBrand());
    }
    @Test
    public void brandCorrectoAlCambiarloZenith(){
        tele.setBrand("Zenith");
        assertEquals("Zenith", tele.getBrand());
    }
    @Test
    public void brandCorrectoAlCambiarloHitachi(){
        tele.setBrand("Hitachi");
        assertEquals("Hitachi", tele.getBrand());
    }
    @Test
    public void brandCorrectoAlCambiarloRCA(){
        tele.setBrand("RCA");
        assertEquals("RCA", tele.getBrand());
    }
    @Test
    public void brandCorrectoAlCambiarloNoValido(){
        tele.setBrand("RCA2");
        assertThat(tele.getBrand(), not(is("RCA2")));
    }

    @Test
    public void dameMarcaYVolumen(){
        assertEquals("RCA:0", tele.dameMarcaYVolumen());
    }
    @Test
    public void dameMarcaYVolumenConDatos(){
        tele.setBrand("Sony");
        tele.setVolume(2);
        assertEquals("Sony:2",tele.dameMarcaYVolumen());
    }

    @Test
    public void compruebaToString() {
        assertThat(tele.toString(), is("Television{brand='RCA', volume=0}"));
    }
    @Test
    public void compruebaToStringConDatos(){
        tele.setBrand("Sony");
        tele.setVolume(2);
        assertThat(tele.toString(), is("Television{brand='Sony', volume=2}"));
    }

    @Test
    public void compruebaContructorConParametros(){
        tele= new Television(10, "Sony");
        assertThat(tele.getVolume(), is(10));
        assertThat(tele.getBrand(),is("Sony"));
    }
    @Test
    public void compruebaContructorConTresParametros(){
        tele= new Television(10, "Sony",new Tuner());
        assertThat(tele.getVolume(), is(10));
        assertThat(tele.getBrand(),is("Sony"));
        assertThat(tele.getTuner(),notNullValue());
        assertThat(tele.getTuner().getChannel(),is(""));
    }
    @Test
    public void compruebaContructorConTresParametrosCompletos(){
        tele= new Television(10, "Sony",new Tuner("La Sexta"));
        assertThat(tele.getVolume(), is(10));
        assertThat(tele.getBrand(),is("Sony"));
        assertThat(tele.getTuner(),notNullValue());
        assertThat(tele.getTuner().getChannel(),is("La Sexta"));
    }
    @Test
    public void compruebaSetterYGetterDeTuner(){
        tele.setTuner(new Tuner());
        assertThat(tele.getTuner(), notNullValue());
        assertThat(tele.getTuner().getChannel(), is(""));
        tele.setTuner(new Tuner("La sexta"));
        assertThat(tele.getTuner().getChannel(), is("La sexta"));
    }
    @Test
    public void compruebaGetterYSetterDeCanal(){
        tele.gotoChannel("La sexta");
        assertThat(tele.getCurrentChannel(),is("La sexta"));
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

    @Test
    public void pruebaQueMuteaCorrectamente(){
        tele.setVolume(10);
        tele.mute();
        assertThat(tele.getVolume(),is(0));
    }
    @Test
    public void pruebaQueMuteaCorrectamenteDosVeces(){
        tele.setVolume(10);
        tele.mute();
        assertThat(tele.getVolume(), is(0));
        assertThat(tele.getMuted(), is(true));
        tele.mute();
        assertThat(tele.getVolume(), is(10));
        assertThat(tele.getMuted(),is(false));
    }
}
