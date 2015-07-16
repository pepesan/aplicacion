package com.tsystems.aplicacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.out.println( "Hola Mundo!" );

        //Instancia de un objeto de la clase AlarmClock
        AlarmClock reloj=new AlarmClock();
        reloj.snooze();
        System.out.println(reloj.getSnoozeInterval());
        int snoozeInterval = reloj.getSnoozeInterval();

        int n;// no initialization
        int j = 0;// with initialization
        int k = j + 1; // initialize with expression
        float r = 0.0F;// float (decimals default to double)
        long largo=1111_1111_1111L;
        String hi = "Hello";

        //Casting
        float diameter = 6.77F;
        float pi = 3.1415927F;
        double circum = pi * diameter; // auto "upcast" to double
        float approx = (float) circum; // explicit "downcast"
        System.out.println(approx);
        //call method
        reloj.setSnoozeInterval(1000);
        System.out.println(reloj.getSnoozeInterval());
        reloj.setSnoozeInterval(1, 30);
        System.out.println(reloj.getSnoozeInterval());

        // call println(String)
        System.out.println("2 + 2 = ");
//      //call println(int)
        System.out.println(4);
    }
}
