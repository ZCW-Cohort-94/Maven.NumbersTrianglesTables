package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder newStr = new StringBuilder();
        String useStr = new String();
        String lastStr = new String();

        useStr = "*";

        for(int i = 1; i < numberOfRows; i++){
            newStr.append(useStr.repeat(i));
            newStr.append("\n");
        }

        lastStr = newStr.toString();

        return lastStr;
    }

    public static String getRow(int width) {
        StringBuilder newStr = new StringBuilder();
        String lastStr = new String();

        for(int i = 1; i <= width; i++){
            newStr.append("*");
        }
        lastStr = newStr.toString();


        return lastStr;
    }

    public static String getSmallTriangle(int width) {
        StringBuilder newStr = new StringBuilder();
        String useStr = new String();
        String lastStr = new String();

        useStr = "*";

        for(int i = 1; i <= width; i++){
            newStr.append(useStr.repeat(i));
            newStr.append("\n");
        }

        lastStr = newStr.toString();



        return lastStr;
    }

    public static String getLargeTriangle(int width) {
        StringBuilder newStr = new StringBuilder();
        String useStr = new String();
        String lastStr = new String();

        useStr = "*";

        for(int i = 1; i <= width; i++){
            newStr.append(useStr.repeat(i));
            newStr.append("\n");
        }

        lastStr = newStr.toString();



        return lastStr;
    }
}
