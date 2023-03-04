package io.zipcoder.microlabs.mastering_loops;
import java.lang.*;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder getEven = new StringBuilder();
        for(int i = start; i<stop; i++){
            if(i%2==0){
                getEven.append(i);
            }
        }
        return getEven.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder getOdd = new StringBuilder();
        for(int i = start; i<stop; i++){
            if(i%2!=0){
                getOdd.append(i);
            }
        }

        return getOdd.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder getSquare = new StringBuilder();
        for(int i = start; i<stop; i++){
            getSquare.append(i * i);
            i =  i + step - 1;
        }
        return getSquare.toString();
    }

    public static String getRange(int stop) {
        StringBuilder getRange = new StringBuilder();
        for(int i = 0; i<stop; i++ ){
            getRange.append(i);
        }

        return getRange.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder getRange = new StringBuilder();
        for(int i = start; i<stop; i++ ){
            getRange.append(i);
        }
        return getRange.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder getRange = new StringBuilder();
        while(start<stop){
            getRange.append(start);
            start = start + step;
        }

        return getRange.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder getExp = new StringBuilder();
        for(int i = start; i<stop; i++){
            int ans = (int) Math.pow(i*i, exponent);
            getExp.append(ans);
            i = i + step - 1;
        }
        return getExp.toString();
    }
}
