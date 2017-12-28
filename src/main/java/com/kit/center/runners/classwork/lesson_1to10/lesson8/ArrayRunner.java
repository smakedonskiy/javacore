package com.kit.center.runners.classwork.lesson_1to10.lesson8;

public class ArrayRunner {
    public static void main(String[] args) {
//        create2Array();
//        print2Array();

        int[] ints = {3, 4, 5};

        for (int i = 0; i < 6; i++){
            isChecked(ints[i]);
            System.out.println(ints[i]);
        }

//        for (int i : ints){
//            System.out.println(i);
//        }


    }

    public static boolean isChecked(int i){
        boolean result = true;
        if (i == 4) result = false;
        return result;
    }

    static int[][] intArray = new int[5][5];

    public static void create2Array() {
        for (int j = 0; j < intArray.length; j++) {
            for (int k = 0; k < intArray[j].length; k++) {
                intArray[j][k] = (j + 2) * (k + 3);
            }
        }
    }

    public static void print2Array() {
        for (int j = 0; j < intArray.length; j++) {
            for (int k = 0; k < intArray[j].length; k++) {
                System.out.printf("%5d", intArray[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
