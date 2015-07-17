package com.tsystems.aplicacion;

/**
 * Created by pepesan on 17/7/15.
 */
public class Helper {

        public static void varMethod(String... strings) {
            for (String cur : strings) { // Iterate over it
                System.out.println(cur);
            }
            System.out.println(strings.length); // Treat like array
        }
}
