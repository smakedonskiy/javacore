package com.kit.center.app.classwork.lesson_1to10.lesson8;

public class Loops {

    public void loop(int a, int b){
        while (a!=b){
            System.out.println("a = " + a + ", b = " + b);
            a--;
        }
    }

    public void loopFor(){
        for (int i = 0; i < 11; i++){
            System.out.print(i + " ");
        }
    }

    public int counter = 0;
    public void point(int number){
        for (int i = 1; i <= number; i++){
            if (i%2 == 0){
                System.out.print(i + " ");
                counter++;
            }
        }
    }



}
