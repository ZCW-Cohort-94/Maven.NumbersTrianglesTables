package io.zipcoder.microlabs.mastering_loops;

import org.codehaus.plexus.util.StringUtils;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String str = "";
        for(int i = 1; i<numberOfRows; i++){
           str = str + StringUtils.repeat("*", i) + "\n";
        }
        return str;
    }

    public static String getRow(int numberOfStars) {
        StringBuilder getRow = new StringBuilder();
        for(int i = 1; i<=numberOfStars; i++){
            getRow.append("*");
        }
        return getRow.toString();
    }

    public static String getSmallTriangle() {
        String str = "";
        for(int i = 1; i<=4; i++){
            str = str + StringUtils.repeat("*", i) + "\n";
        }
        return str;
    }

    public static String getLargeTriangle() {
        String str = "";
        for(int i = 1; i<10; i++){
            str = str + StringUtils.repeat("*", i) + "\n";
        }
        return str;
    }
}
