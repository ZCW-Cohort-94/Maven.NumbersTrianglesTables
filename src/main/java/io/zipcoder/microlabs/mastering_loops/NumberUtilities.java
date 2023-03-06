package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String str = new String();
        for (int i = start; i <= stop - 1; i += 2) {
            str = str + i;
        }
        return str;
    }


    public static String getOddNumbers(int start, int stop) {
        String str = new String();
        for (int i = start; i <= stop - 1; i += 2) {
            str = str + i;
        }
        return str;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String str = new String();
        for (int i = start; i <= stop - 1; i += 5) {
            int sqrt = i * i;
            str = str + sqrt;
        }
        return str;
    }

    public static String getRange(int start) {
        String str = new String();
        for (int i = start; i < 10; i++) {
            str = str + i;
        }
        return str;
    }


    public static String getRange(int start, int stop) {
        String str = new String();
        for (int i = start; i < stop; i++) {
            str = str + i;
        }
        return str;
    }


    public static String getRange(int start, int stop, int step) {
        String str = new String();
        for (int i = start; i < stop; i += step) {
            str = str + i;
        }
        return str;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String str = new String();
        for (int i = start; i < stop; i += step) {
            int exponentVariable = exponent;
            int squarednum = (int) Math.pow(i, exponentVariable);
            str = str + squarednum;
        }
        return str;
    }
}
