package com.kit.center.app.classwork.lesson_1to10.lesson4;

public class WideningCasting {
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 5.14159f;
    double double1 = 198.14d;

    public void widening() {
        //double1 = float1 = long1 = int1 = short1 = byte1;
        byte1 = (byte) double1;
        System.out.println(byte1);
    }
}
