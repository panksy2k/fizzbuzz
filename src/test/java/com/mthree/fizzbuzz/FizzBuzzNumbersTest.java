package com.mthree.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzNumbersTest {

    @Test
    public void whenFunctionGivenFizzNumber_returnFizz() {
        //given
        //when
        String actualResult = FizzBuzzNumbers.f2.apply(9);

        //then
        Assert.assertEquals("Fizz", actualResult);
    }

    @Test
    public void whenFunctionGivenBuzzNumber_returnBuzz() {
        //given
        //when
        String actualResult = FizzBuzzNumbers.f2.apply(20);

        //then
        Assert.assertEquals("Buzz", actualResult);
    }

    @Test
    public void whenFunctionGivenFizzBuzzNumber_returnFizzBuzz() {
        //given
        //when
        String actualResult = FizzBuzzNumbers.f2.apply(45);

        //then
        Assert.assertEquals("FizzBuzz", actualResult);
    }

    @Test
    public void whenFunctionGivenNonFizzBuzzNumber_returnNumber() {
        //given
        //when
        String actualResult = FizzBuzzNumbers.f2.apply(13);

        //then
        Assert.assertEquals("13", actualResult);
    }

    @Test
    public void whenFunctionGivenInvalidFizzBuzzNumber_returnInvalidInput() {
        //given
        //when
        String actualResult = FizzBuzzNumbers.f2.apply(-25);

        //then
        Assert.assertEquals("INVALID", actualResult);
    }
}
