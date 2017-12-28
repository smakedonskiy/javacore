package com.kit.center.runners.classwork.lesson_1to10.lesson7_1;

import com.kit.center.app.classwork.lesson_1to10.lesson8.Loops;

import java.util.Arrays;

public class LoopsRunner {
    public static void main(String[] args) {
        Loops loops = new Loops();
        //loops.loop(50, 30);
        //loops.loopFor();

        /*
        int i = 1;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

*/
        /*
        loops.point(20);
        System.out.println();
        System.out.println("total: " + loops.counter);
        */


        int[] array = new int[10];

        for (int i = 0; i<array.length; i++){
            array[i] = i;
        }

        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(array));

    }
}
