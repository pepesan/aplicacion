package com.tsystems.aplicacion;



import java.util.EnumSet;

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
        long largo=111111111111L;
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
        //call println(int)
        System.out.println(4);

        System.out.println(reloj);


        AlarmClock reloj2=new AlarmClock(7);
        System.out.println(reloj2.getSnoozeInterval());


        System.out.println(Contador.numero);
        Contador.numero++;
        System.out.println(Contador.numero);

        Contador.estatico();

        System.out.println(Contador.CONSTANTE);


        //enumerados
        //Formerly, you could only switch on byte, short, int, char
        Day d=Day.FRIDAY;
        switch (d)
        {
            case MONDAY:
                break;
            case FRIDAY:
                break;
            case THURSDAY:
                break;
            case TUESDAY:
                break;
                default:
                    break;
        }

        for (Day d2 : Day.values()) {
            System.out.println(d2);  // prints "SUNDAY", "MONDAY", etc
        }
        for (Day d3 : EnumSet.range(Day.MONDAY, Day.FRIDAY)) {
            System.out.println(d3);  // weekdays only
        }
        AlarmClock myClock = new AlarmClock();
        //AlarmClock yourClock = new AlarmClock();
        AlarmClock yourClock = myClock; // yourClock ref to same object as myClock
        if (myClock == yourClock) { // true in this case System.out.println("one Clock");
            System.out.println("Las referencias son las mismas");
        }
        if (myClock.equals(yourClock)) { // true in this case System.out.println("one Clock");
            System.out.println("Los objetos son iguales");
        }

        yourClock=new AlarmClock();
        if (myClock.equals(yourClock)) { // true in this case System.out.println("one Clock");
            System.out.println("Los objetos son iguales");
        }

        Worker w=new Worker();
        w.sleepMore(yourClock);
        System.out.println(yourClock.getSnoozeInterval());


        String s="Hola Strings";
        s=new String("Hola Strings");
        s+=" y a Pepe";
        StringBuffer buffer=new StringBuffer();
        buffer.append("Hola");
        String cad=buffer.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("Hola");
        cad=builder.toString();

        int[] iArray = new int[7];
        iArray[0] = 10;
        iArray[6] = 100;

        int[] tenPrimes = {2,3,5,7,11,13,17,19,23,29};
        int firstPrime = tenPrimes[0];

        AlarmClock[] clockArray = new AlarmClock[10];
        clockArray[0] = new AlarmClock();
        for (int i=0;i<10;i++){
            clockArray[i]= new AlarmClock();
        }
        AlarmClock []clockArray2 = {new AlarmClock(),new AlarmClock(100) };
        String[] nameArray = new String[7];
        nameArray[0] = "Jon";
        nameArray[6] = "Kate";
        for (String cadena : nameArray) {
            System.out.println(cadena);
        }
        Helper.varMethod();
        Helper.varMethod("Uno");
        //Bono dixit, el de verdad no el chungo ese del EJKE
        Helper.varMethod("Un","Dos","Tres","Catorce");

        for(String cade: args){
            System.out.println(cade);
        }
    }

}
