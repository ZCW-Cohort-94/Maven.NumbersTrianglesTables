package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int numEven = 0;
        String answerString = new String();
        answerString = String.valueOf(numEven);
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                numEven++;


            }
            System.out.println(answerString);


        }
//	  int num = 123;
//	  String str = String.valueOf(num);
        return answerString;
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
