package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                lastString = newString.append(i).toString();
            }
        }


        return lastString;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                lastString = newString.append(i).toString();
            }
        }
        return lastString;
    }


    public static String getSquareNumbers(int start, int stop) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i++){
            newString.append((int)Math.sqrt(i));
        }
        lastString = newString.toString();


        return lastString;
    }

    public static String getRange(int stop) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = 0; i < stop; i++){
            newString.append(i);
        }

        lastString = newString.toString();

        return lastString;
    }

    public static String getRange(int start, int stop) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i++){
            newString.append(i);
        }

        lastString = newString.toString();

        return lastString;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i += step){
            newString.append(i);
        }

        lastString = newString.toString();

        return lastString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder newString = new StringBuilder();
        String lastString = new String();

        for(int i = start; i < stop; i += step){
            newString.append((int)Math.pow(i, exponent));
        }
        lastString = newString.toString();

        return lastString;
    }
}
