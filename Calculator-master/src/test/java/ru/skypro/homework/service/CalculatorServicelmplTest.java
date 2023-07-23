package ru.skypro.homework.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.zone.ZoneRulesException;

public class CalculatorServicelmplTest {
    private CalculatorService calculatorService = new CalculatorServicelmpl();

    @Test
    public void sum() {
        int result = calculatorService.sum(2, 4);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void sum1() {
        int result = calculatorService.sum(8, 4);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void subtract() {
        int result = calculatorService.subtract(8, 4);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void subtract1() {
        int result = calculatorService.subtract(5, 4);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void multiply() {
        int result = calculatorService.multiply(2, 2);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void multiply1() {
        int result = calculatorService.multiply(5, 5);

        Assertions.assertEquals(20, result);
    }

    @Test
    public void divide() {
        int result = calculatorService.divide(8, 4);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void divide1() {
        int result = calculatorService.divide(8, 4);

        Assertions.assertEquals(5, result);
    }


    @Test
    public void divide0() {
        Assertions.assertThrows(Exception.class, () -> calculatorService.divide(10, 0));
    }

}
