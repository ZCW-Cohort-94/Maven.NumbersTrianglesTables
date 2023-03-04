package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int width) {
        String str = "";
        for(int i = 1; i <= width; i++){
            for(int k = 1; k <= width; k++){
                str = str + String.format("%5s", i * k + " |");
            }
            str = str + "\n";
        }

        return str;
    }

    public static String getLargeMultiplicationTable(int width) {
        String str = "";
        for(int i = 1; i <= width; i++){
            for(int k = 1; k <= width; k++){
                str = str + String.format("%5s", i * k + " |");
            }
            str = str + "\n";
        }


        return str;
    }

    public static String getMultiplicationTable(int width) {
        String str = "";
        for(int i = 1; i <= width; i++){
            for(int k = 1; k <= width; k++){
                str = str + String.format("%5s", i * k + " |");
            }
            str = str + "\n";
        }

        return str;
    }
}
