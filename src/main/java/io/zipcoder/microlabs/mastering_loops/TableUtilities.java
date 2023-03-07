package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder multitab = new StringBuilder(tableSize);
        for(int i = 1; i <= tableSize; i++) {

            for(int j = 1; j <= tableSize; j++) {
                multitab.append(String.format("%3d |", i * j));

            }
            multitab.append("\n");
            //System.out.println();

        }
        return multitab.toString();
    }
}
