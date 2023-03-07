package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder starrow= new StringBuilder(numberOfRows);
        for(int i = 1; i < numberOfRows; i++)  {
            starrow.append(getRow(i) + "\n");


        }
        return starrow.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder starrow= new StringBuilder(numberOfStars);
        for(int i = 1; i <= numberOfStars; i++) {

            /*for(int j = 1; j <= i; j++) {
                starrow.append("*");

            }*/
            starrow.append("*");
            //System.out.println();

        }
        return starrow.toString();
    }

    public static String getSmallTriangle() {


        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
