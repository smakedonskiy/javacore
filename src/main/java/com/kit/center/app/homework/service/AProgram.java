package com.kit.center.app.homework.service;

import com.kit.center.runners.homework.total.TotalController;

import java.util.Scanner;


public abstract class AProgram implements IRunnable{

    protected String name;
    protected String description;

    public Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println();
        System.out.println(getName());
        System.out.println(getDescription());
    }

    protected void quit() {
        System.out.print("Continue? ('1'-yes/'0'-no): ");
        int userQuit = sc.nextInt();
        switch (userQuit) {
            case 1:
                run();
                break;
            case 0:
                TotalController controller = new TotalController();
                controller.start();
                break;
            default:
                quit();
        }
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
