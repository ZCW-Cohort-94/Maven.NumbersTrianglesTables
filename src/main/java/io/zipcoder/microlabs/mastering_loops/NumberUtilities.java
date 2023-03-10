package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String answerString = new String();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                answerString += i;
            }
        }
        return answerString;
    }


    public static String getOddNumbers(int start, int stop) {

        String answerString = new String();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                answerString += i;
            }
        }
        return answerString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String answerString = new String();
        for (int i = start; i < stop; i += 5) {
            answerString += i * i;
        }
        return answerString;
    }

    public static String getRange(int stop) {
        String answerString = "";
        for (int i = 0;i < stop; i++){
            answerString += i;

        }

        return answerString;
    }

    public static String getRange(int start, int stop) {
        String answerString = "";
        for (int i = start;i < stop; i++){
            answerString += i;

        }

        return answerString;
    }


    public static String getRange(int start, int stop, int step) {
        String answerString = "";
        for (int i = start;i < stop; i+=step){
            answerString += i;
                    }

        return answerString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String answer = "";
        for(int i = start; i < stop; i += step){
            answer += (int) Math.pow(i, exponent);
        }

        return answer;
    }
}
