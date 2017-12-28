package com.kit.center.app.homework.lesson_1to10.lesson5;

import com.kit.center.app.homework.service.ATask;


public class DifferentExamples extends ATask {

    private int a, b, c, d;

    {
        super.name += "\"Different examples\"";
        super.description += "This program shows different examples.\n"
                + "* Values generate automation.";
    }



    @Override
    public void run() {
        super.run();

        randomInitializationABCD();
        showValueABCD();
        System.out.println("=======     =======");

        System.out.println("Max ABCD is: " + maxABCD());
        System.out.println("Min ABCD is: " + minABCD());
        System.out.println("Average ABCD is: " + averageABCD());
        System.out.println("A * A is: " + squareA());
        System.out.println("Number 'B' is from 150 to 750: " + checkBFrom150To750());
        System.out.println("=======     =======");

        System.out.println("Number 'D' is: " + signNumberD());
        System.out.println("Modul number 'D' is: " + abcNumberD());
        System.out.println("Log10 from number 'D' is: " + log10FromD() +
                " -> " + roundDForLog10() + " (round of a number 'D')");
        System.out.println("Cosinus from number 'D' is: " + cosNumberD() +
                " -> " + roundDForCos() + " (round of a number 'D')");
        System.out.println("=======     =======");

        quit();
    }


    public void randomInitializationABCD() {
        this.a = (int) (Math.random() * 1000 - 200);
        this.b = (int) (Math.random() * 1000 - 200);
        this.c = (int) (Math.random() * 1000 - 200);
        this.d = (int) (Math.random() * 1000 - 200);
    }

    public void showValueABCD() {
        System.out.println("a = " + getA() + ", is parity: " + checkAForParity() +
                "\nb = " + getB() + ", is parity: " + checkBForParity() +
                "\nc = " + getC() + ", is parity: " + checkCForParity() +
                "\nd = " + getD() + ", is parity: " + checkDForParity());
    }

    private boolean checkAForParity() {
        boolean result = true;
        if (getA() % 2 != 0) result = false;
        return result;
    }

    private boolean checkBForParity() {
        boolean result = true;
        if (getB() % 2 != 0) result = false;
        return result;
    }

    private boolean checkCForParity() {
        boolean result = true;
        if (getC() % 2 != 0) result = false;
        return result;
    }

    private boolean checkDForParity() {
        boolean result = true;
        if (getD() % 2 != 0) result = false;
        return result;
    }

    public int summaAB() {
        return getA() + getB();
    }

    public int summaABC() {
        return getA() + getB() + getC();
    }

    public int summaABCD() {
        return getA() + getB() + getC() + getD();
    }

    public double divAB() {
        return getA() / (double) getB();
    }

    public int multiBC() {
        return getB() * getC();
    }

    public int maxABCD() {
        int max = getA();
        if (getA() < getB() || getA() < getC() || getA() < getD()) {
            max = getB();
            if (getB() < getC() || getB() < getD()) {
                max = getC();
                if (getC() < getD()) {
                    max = getD();
                }
            }
        }
        return max;
    }

    public int minABCD() {
        int min = getA();
        if (getA() > getB() || getA() > getC() || getA() > getD()) {
            min = getB();
            if (getB() > getC() || getB() > getD()) {
                min = getC();
                if (getC() > getD()) {
                    min = getD();
                }
            }

        }
        return min;
    }

    public double averageABCD() {
        return (getA() + getB() + getC() + getD()) / 4.0d;
    }

    public int squareA() {
        return getA() * getA();
    }

    public boolean checkBFrom150To750() {
        boolean result = false;
        if (getB() >= 150 && getB() <= 750) result = true;
        return result;
    }


    public double areaCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public int areaRectangle(int a, int b) {
        return a * b;
    }

    public int areaSquare(int a) {
        return a * a;
    }

    public double areaTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public double volumeBall(int radius) {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public String signNumberD() {
        double signDouble = Math.signum(getD());
        String signString = "positive";
        if (signDouble < 0) signString = "negative";
        return signString;
    }

    public int abcNumberD() {
        return Math.abs(getD());
    }

    public double log10FromD() {
        return Math.log10(getD());
    }

    public double cosNumberD() {
        return Math.cos(getD());
    }

    public int roundDForLog10() {
        return (int) Math.round(log10FromD());
    }

    public int roundDForCos() {
        return (int) Math.round(cosNumberD());
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

}
