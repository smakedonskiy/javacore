package com.kit.center.app.homework.lesson_1to10.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class RightAngledTriangleTest {
    Triangle triangle = new Triangle();

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\triangleGetResultMessage.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getResultMessage(int a, int b, int c, String expResult) throws Exception {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
        assertEquals(expResult, triangle.getResult());
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\triangleGetABC.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getATest(int a, int expResult) throws Exception {
        triangle.setA(a);
        assertEquals(expResult, triangle.getA());
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\triangleGetABC.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getBTest(int b, int expResult) throws Exception {
        triangle.setB(b);
        assertEquals(expResult, triangle.getB());
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\triangleGetABC.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getCTest(int c, int expResult) throws Exception {
        triangle.setC(c);
        assertEquals(expResult, triangle.getC());
    }

}