package io.zipcoder.microlabs.mastering_loops;

import org.apache.maven.shared.utils.StringUtils;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String finalTriangle = "";
        for(int i = 1; i < numberOfRows; i++) {
            String miTriangle = new String(StringUtils.repeat("*", i));
            finalTriangle += miTriangle + "\n";
        }
        return finalTriangle;
    }

    public static String getRow(int numberOfStars) {

       String answer = new String(StringUtils.repeat("*",numberOfStars));

       return answer;
    }

    public static String getSmallTriangle() {
        return TriangleUtilities.getTriangle(5);

    }

    public static String getLargeTriangle() {

        return TriangleUtilities.getTriangle(10);
    }
}
