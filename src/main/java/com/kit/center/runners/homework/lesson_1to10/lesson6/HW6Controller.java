package com.kit.center.runners.homework.lesson_1to10.lesson6;

import com.kit.center.app.homework.lesson_1to10.lesson6.BiggerNumber;
import com.kit.center.app.homework.lesson_1to10.lesson6.CircleArea;
import com.kit.center.app.homework.lesson_1to10.lesson6.Triangle;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW6Controller extends AHomework{

    Scanner sc = new Scanner(System.in);

    private BiggerNumber programBiggerNumber = new BiggerNumber();
    private CircleArea programCircleArea = new CircleArea();
    private Triangle programTriangle = new Triangle();

    {
        super.name += "6. ";
        super.description += "\"Control statements\".";
    }


    @Override
    public void run() {
        printHelp();
        System.out.print("Input your number: ");
        chooseProgram(sc.nextInt());

    }

    private void printHelp() {
        String helpMessage =
                "\n*** Help for " + super.name + " ***\n" +
                "0 - exit\n" +
                "1 - " + programTriangle.getName() + "\n" +
                "2 - " + programCircleArea.getName() + "\n" +
                "3 - " + programBiggerNumber.getName();
        System.out.println(helpMessage);
    }

    private void chooseProgram(int userInput) {
        switch (userInput) {
            case 0:
                TotalController totalController = new TotalController();
                totalController.start();
                break;
            case 1:
                programTriangle.run();
                break;
            case 2:
                programCircleArea.run();
                break;
            case 3:
                programBiggerNumber.run();
                break;
            default:
                run();
        }
    }

}
