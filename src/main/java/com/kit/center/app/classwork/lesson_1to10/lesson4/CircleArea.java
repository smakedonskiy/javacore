package com.kit.center.app.classwork.lesson_1to10.lesson4;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int a = number%2;
        if (a == 0){
            System.out.println("Number is p");
        } else System.out.println("Number is not p");

        /*
        System.out.print("Input a radius1: ");
        double radius1 = scanner.nextDouble();

        System.out.print("Input a radius2: ");
        double radius2 = scanner.nextDouble();
        double circleArea1 = 3.14 * radius1 * radius1;
        double circleArea2 = 3.14 * radius2 * radius2;
        if ((radius1 > radius2) || (circleArea1 > circleArea2)){
            System.out.println("Area1 is bigger");
            System.out.println("Area2 is smaller");
        }
        else{
            System.out.println("Area2 is bigger");
            System.out.println("Area1 is smaller");
        }
        */


    }
}
