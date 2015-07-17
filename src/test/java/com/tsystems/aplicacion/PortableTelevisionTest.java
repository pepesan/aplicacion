package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by pepesan on 17/7/15.
 */
public class PortableTelevisionTest {
    PortableTelevision ptv;

    @Before
    public void setUp(){
        ptv=new PortableTelevision();
    }

    @Test
    public void pruebaGetterYSetterRecharge(){
        ptv.setRechargeLevel(70);
        assertThat(ptv.getRechargeLevel(),is(70));
    }
    @Test
    public void pruebaGetterYSetterVolumen(){
        ptv.setVolume(70);
        assertThat(ptv.getVolume(),is(70));
    }
    @Test
    public void pruebaToStringBasica(){
        assertThat(ptv.toString(),is("PortableTelevision{rechargeLevel=0,Television{brand='RCA', volume=0}}"));
    }
    @Test
    public void pruebaToStringCompleta(){
        ptv.setRechargeLevel(10);
        ptv.setBrand("Sony");
        ptv.setVolume(10);
        assertThat(ptv.toString(),is("PortableTelevision{rechargeLevel=10,Television{brand='Sony', volume=10}}"));
    }
}

