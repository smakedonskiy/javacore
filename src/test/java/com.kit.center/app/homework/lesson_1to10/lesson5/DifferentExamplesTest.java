package com.kit.center.app.homework.lesson_1to10.lesson5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DifferentExamplesTest {
    DifferentExamples instance = new DifferentExamples();

    @Test
    public void summaABTest() throws Exception {
        instance.setA(5);
        instance.setB(-5);
        int expResult = 0;
        assertEquals(expResult, instance.summaAB());
    }

    @Test
    public void summaABCTest() throws Exception {
        instance.setA(2);
        instance.setB(3);
        instance.setC(-7);
        int expResult = -2;
        assertEquals(expResult, instance.summaABC());
    }

    @Test
    public void summaABCDTest() throws Exception {
        instance.setA(100);
        instance.setB(50);
        instance.setC(-200);
        instance.setD(300);
        int expResult = 250;
        assertEquals(expResult, instance.summaABCD());
    }

    @Test
    public void divABTest() throws Exception {
        instance.setA(8);
        instance.setB(-2);
        double expResult = -4.0;
        assertEquals(expResult, instance.divAB(), 0.0);
    }

    @Test
    public void multiBCTest() throws Exception {
        instance.setB(3);
        instance.setC(4);
        int expResult = 12;
        assertEquals(expResult, instance.multiBC());
    }

    @Test
    public void areaCircleTest() throws Exception {
        int radius = 1;
        double expResult = 3.14;
        assertEquals(expResult, instance.areaCircle(radius), 0.2);
    }

    @Test
    public void areaRectangleTest() throws Exception {
        int a = 4, b = 5;
        int expResult = 20;
        assertEquals(expResult, instance.areaRectangle(a, b));
    }

    @Test
    public void areaSquareTest() throws Exception {
        int a = 6;
        int expResult = 36;
        assertEquals(expResult, instance.areaSquare(a));
    }

    @Test
    public void areaTriangleTest() throws Exception {
        int a = 3, b = 3, c = 4;
        double expResult = 4.47;
        assertEquals(expResult, instance.areaTriangle(a, b, c), 0.1);
    }

    @Test
    public void volumeBallTest() throws Exception {
        int radius = 1;
        double expResult = 3.14;
        assertEquals(expResult, instance.volumeBall(radius), 0.02);
    }

    @Test
    public void signNumberDTest() throws Exception {
        instance.setD(-5);
        String expResult = "negative";
        assertEquals(expResult, instance.signNumberD());
    }

    @Test
    public void abcNumberDTest() throws Exception {
        instance.setD(-12);
        int expResult = 12;
        assertEquals(expResult, instance.abcNumberD());
    }

    @Test
    public void log10FromDTest() throws Exception {
        instance.setD(88);
        double expResult = 1.9;
        assertEquals(expResult, instance.log10FromD(), 0.2);
    }

    @Test
    public void cosNumberDTest() throws Exception {
        instance.setD(-95);
        double expResult = 0.73;
        assertEquals(expResult, instance.cosNumberD(), 0.2);
    }

    @Test
    public void roundDForLog10Test() throws Exception {
        instance.setD(88);
        int expResult = 2;
        assertEquals(expResult, instance.roundDForLog10());
    }

    @Test
    public void minABCDTest() {
        instance.setA(2);
        instance.setB(3);
        instance.setC(-5);
        instance.setD(4);
        int expResult = -5;
        assertEquals(expResult, instance.minABCD());
    }

    @Test
    public void averageABCDTest() {
        instance.setA(2);
        instance.setB(3);
        instance.setC(3);
        instance.setD(2);
        double expResult = 2.5;
        assertEquals(expResult, instance.averageABCD(), 0.0);
    }

    @Test
    public void squareATest() {
        instance.setA(5);
        int expResult = 25;
        assertEquals(expResult, instance.squareA());
    }

    @Test
    public void checkBFrom150To750Test() {
        instance.setB(200);
        boolean expResult = true;
        assertEquals(expResult, instance.checkBFrom150To750());
    }

    @Test
    public void maxABCD_checkATest() {
        instance.setA(15);
        instance.setB(3);
        instance.setC(-5);
        instance.setD(4);
        int expResult = 15;
        assertEquals(expResult, instance.maxABCD());
    }

    @Test
    public void maxABCD_checkBTest() {
        instance.setA(15);
        instance.setB(33);
        instance.setC(-5);
        instance.setD(4);
        int expResult = 33;
        assertEquals(expResult, instance.maxABCD());
    }

    @Test
    public void maxABCD_checkCTest() {
        instance.setA(15);
        instance.setB(3);
        instance.setC(55);
        instance.setD(4);
        int expResult = 55;
        assertEquals(expResult, instance.maxABCD());
    }

    @Test
    public void maxABCD_checkDTest() {
        instance.setA(15);
        instance.setB(3);
        instance.setC(-5);
        instance.setD(27);
        int expResult = 27;
        assertEquals(expResult, instance.maxABCD());
    }

    @Test
    public void maxABCD_checkEqualsTest() {
        instance.setA(0);
        instance.setB(0);
        instance.setC(0);
        instance.setD(0);
        int expResult = 0;
        assertEquals(expResult, instance.maxABCD());
    }
}