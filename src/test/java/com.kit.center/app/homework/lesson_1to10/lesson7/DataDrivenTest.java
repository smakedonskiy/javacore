package com.kit.center.app.homework.lesson_1to10.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class DataDrivenTest {
    static DataDriven test;

    @BeforeClass
    public static void setUp() throws Exception {
        test = new DataDriven();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        test = null;
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\maxABCD.csv",
            mapper = CsvWithHeaderMapper.class)
    public void maxABCDTest(int a, int b, int c, int d, int expResult) throws Exception {
        assertEquals(expResult, test.maxABCD(a, b, c, d));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\compareAB.csv",
            mapper = CsvWithHeaderMapper.class)
    public void compareAB(int a, int b, boolean expResult) throws Exception {
        assertEquals(expResult, test.compareAB(a, b));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\costOfTicket.csv",
            mapper = CsvWithHeaderMapper.class)
    public void costOfTicket(int age, int expResult) throws Exception {
        assertEquals(expResult, test.costOfTicket(age));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\parityCheck.csv",
            mapper = CsvWithHeaderMapper.class)
    public void parityCheck(int a, boolean expResult) throws Exception {
        assertEquals(expResult, test.parityCheck(a));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\discountCalculation.csv",
            mapper = CsvWithHeaderMapper.class)
    public void discountCalculation(int costOfGoods, int expResult) throws Exception {
        assertEquals(expResult, test.discountCalculation(costOfGoods));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\passwordCheck.csv",
            mapper = CsvWithHeaderMapper.class)
    public void passwordCheckForComplexity(int password, String expResult) throws Exception {
        assertEquals(expResult, test.passwordCheckForComplexity(password));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\calculate.csv",
            mapper = CsvWithHeaderMapper.class)
    public void calculate(char sign, double a, double b, double expResult) throws Exception {
        assertEquals(expResult, test.calculate(sign, a, b), 0.01);
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\daysOfMonth.csv",
            mapper = CsvWithHeaderMapper.class)
    public void numberDaysOfMonth(int monthNumber, int expResult) throws Exception {
        assertEquals(expResult, test.numberDaysOfMonth(monthNumber));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\daysOfWeek.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dayOfWeek(int weekdayNumber, String expResult) throws Exception {
        assertEquals(expResult, test.dayOfWeek(weekdayNumber));
    }

    @Test
    @FileParameters(value = "src\\test\\resources\\homework\\lesson_1to10\\lesson7\\countYear.csv",
            mapper = CsvWithHeaderMapper.class)
    public void countYear(int yearStart, int yearFinish, int expResult) throws Exception {
        assertEquals(expResult, test.countYear(yearStart, yearFinish));
    }

}