package com.tsystems.aplicacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by pepesan on 17/7/15.
 */
public class ColorTelevisionTest {
    ColorTelevision ctv;

    @Before
    public void setUp(){
        ctv=new ColorTelevision();
    }

    @Test
    public void pruebaSetterYGetterColor(){
        ctv.setColorTint(7);
        assertThat(ctv.getColorTint(),is(7));
    }
    @Test
    public void pruebaGetterYSetterVolumen(){
        ctv.setVolume(70);
        assertThat(ctv.getVolume(),is(70));
    }
    @Test
    public void pruebaToStringBasica(){
        assertThat(ctv.toString(),is("ColorTelevision{colorTint=0,Television{brand='RCA', volume=0}}"));
    }
    @Test
    public void pruebaToStringCompleta(){
        ctv.setColorTint(10);
        ctv.setBrand("Sony");
        ctv.setVolume(10);
        assertThat(ctv.toString(),is("ColorTelevision{" +
                "colorTint=10,Television{brand='Sony', volume=10}}"));
    }
}
