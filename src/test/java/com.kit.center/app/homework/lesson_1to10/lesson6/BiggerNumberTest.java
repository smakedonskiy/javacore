package com.kit.center.app.homework.lesson_1to10.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BiggerNumberTest {
    BiggerNumber numberClass = new BiggerNumber();

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\biggerNumber.csv",
            mapper = CsvWithHeaderMapper.class)
    public void printBiggerNumberTest(int a, int b, String expResult) throws Exception {
        numberClass.setNumberA(a);
        numberClass.setNumberB(b);
        assertEquals(expResult, numberClass.getResult());
    }


}