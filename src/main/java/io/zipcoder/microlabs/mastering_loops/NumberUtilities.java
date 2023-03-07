package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
       String evens = "";
        for(int i = start; i < stop; i++) {
           if(i % 2 == 0) {
               evens += i;
           }
       }
        return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        String odds = "";
        for(int i = start; i < stop; i++) {
            if(i % 2 == 1) {
                odds += i;
            }
        }
        return odds;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String squares = "";
        for(int i = start; i < stop; i += step) {
            squares += i * i;
        }
        return squares;
    }

    public static String getRange(int stop) {
        return getExponentiations(0, stop, 1, 1);
        //return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {

        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo= "";
        for(int i = start; i < stop; i += step) {
            expo += (int) Math.pow(i, exponent);
        }
        return expo;
    }
}
