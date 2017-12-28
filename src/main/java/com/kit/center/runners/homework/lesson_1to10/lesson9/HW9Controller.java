package com.kit.center.runners.homework.lesson_1to10.lesson9;

import com.kit.center.app.homework.lesson_1to10.lesson9.Palindrome;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9Controller extends AHomework {

    private String description = "\n*** Help for Homework 9 ***\n" +
                    "Please, input only letters and integer numbers.\n" +
                    "Input the \"exit\" for quit.\n";
    private String inviteMessage = "Input the word or the sentence: ";
    private Palindrome p;

    {
        super.name += "9. ";
        super.description += "\"String, Object\".";
    }


    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "-1";

        do {
            System.out.println(description);
            System.out.print(inviteMessage);
            try {
                userInput = br.readLine();
                p = new Palindrome(userInput);
            } catch (IOException e) {
                e.printStackTrace();
            }
            p.consoleOutput();
        } while (!userInput.equals("exit"));
        TotalController controller = new TotalController();
        controller.start();
    }


}
