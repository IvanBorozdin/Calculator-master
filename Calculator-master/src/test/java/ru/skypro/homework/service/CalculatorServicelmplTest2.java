package ru.skypro.homework.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServicelmplTest2 {
    private CalculatorService calculatorService = new CalculatorServicelmpl();
    @MethodSource("sumTest")
    @ParameterizedTest
    public void shouldReturnCorrectValueWhenSum0f2Numbers(int num1, int num2, int expected) {
        int result = calculatorService.sum(num1, num2);

        Assertions.assertEquals(expected, result);
    }
    @MethodSource("subtractTest")
    @ParameterizedTest
    public void subtractTest (int num1, int num2, int expected) {
        int result = calculatorService.subtract(num1, num2);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> sumTest(){
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(2,9,11),
                Arguments.of(2,3,5),
                Arguments.of(10,2,12)
        );
    }
    private static Stream<Arguments> subtractTest(){
        return Stream.of(
                Arguments.of(2,2,0),
                Arguments.of(10,9,1)
        );
    }

    }



