package com.kit.center.app.classwork.lesson_1to10.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {
    @Test
    @FileParameters(value = "src\\test\\resources\\classwork\\dataClassLesson6.csv",
            mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expResult) {
//        int a=1;
//        int b=2;
//        int expResult = 2;
        Assert.assertEquals(expResult, MathFunc.multiply(a, b));
    }
}
