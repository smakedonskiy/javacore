package com.kit.center.app.homework.lesson_1to10.lesson7;


public class DataDriven {


    public int maxABCD(int a, int b, int c, int d) {
        int result = a;
        if (a < b || a < c || a < d) {
            result = b;
            if (b < c || b < d) {
                result = c;
                if (c < d) {
                    result = d;
                }
            }
        }
        return result;
    }

    public boolean compareAB(int a, int b) {
        boolean result = false;
        if (a > b) result = true;
        return result;
    }

    public int costOfTicket(int age) {
        int cost = -1;
        if ((age > 0 && age <= 6) || (age >= 61 && age <= 99)) cost = 0;
        if (age >= 7 && age <= 18) cost = 50;
        if (age >= 19 && age <= 21) cost = 75;
        if (age >= 22 && age <= 60) cost = 100;
        return cost;
    }

    public boolean parityCheck(int a) {
        boolean parity = false;
        if (a % 2 == 0) parity = true;
        return parity;
    }

    public int discountCalculation(int costOfGoods) {
        int discount = -1;
        if (costOfGoods > 0 && costOfGoods <= 500) discount = 0;
        if (costOfGoods >= 501 && costOfGoods <= 2000) discount = (int) (costOfGoods * 0.05);
        if (costOfGoods >= 2001 && costOfGoods <= 5000) discount = (int) (costOfGoods * 0.1);
        if (costOfGoods >= 5001 && costOfGoods <= 10000) discount = (int) (costOfGoods * 0.15);
        if (costOfGoods >= 10001) discount = (int) (costOfGoods * 0.2);
        return discount;
    }

    public String passwordCheckForComplexity(int passwordLangth) {
        String message = "-1";
        if ((passwordLangth >= 1 && passwordLangth <= 5) || passwordLangth >= 21)
            message = "Input a password from 6 to 20 characters.";
        if (passwordLangth >= 6 && passwordLangth <= 8)
            message = "The password is weak.";
        if (passwordLangth >= 9 && passwordLangth <= 12)
            message = "The password is middle.";
        if (passwordLangth >= 13 && passwordLangth <= 20)
            message = "The password is high.";
        return message;
    }

    public double calculate(char sign, double a, double b) {
        double result = -0.0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                try {
                    result = a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Div by zero.");
                }
        }
        return result;
    }

    public int numberDaysOfMonth(int monthNumber) {
        int days = -1;
        switch (monthNumber) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        return days;
    }

    public String dayOfWeek(int dayNumber){
        String day="-1";
        switch (dayNumber){
            case 1: day="Monday"; break;
            case 2: day="Tuesday"; break;
            case 3: day="Wednesday"; break;
            case 4: day="Thursday"; break;
            case 5: day="Friday"; break;
            case 6: day="Saturday"; break;
            case 7: day="Sunday"; break;
        }
        return day;
    }

    public int countYear (int yearStart, int yearFinish){
        int result = -1;
        if (yearStart > 0 && yearFinish > yearStart) result = yearFinish - yearStart;
        return result;
    }
}