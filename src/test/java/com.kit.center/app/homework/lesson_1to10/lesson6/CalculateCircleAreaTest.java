package com.kit.center.app.homework.lesson_1to10.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculateCircleAreaTest {
    CircleArea area = new CircleArea();

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\areaGetResultMessage.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getResultMessageTest(int radius, String expResult) throws Exception {
        area.setRadius(radius);
        assertEquals(expResult, area.getResult());
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson6\\areaGetRadius.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getRadiusTest(int radius, int expResult) throws Exception {
        area.setRadius(radius);
        assertEquals(expResult, area.getRadius());
    }

}