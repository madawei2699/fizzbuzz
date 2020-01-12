package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_Fizz_when_given_input_can_be_divided_by_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String actual = fizzBuzz.handleDigit(3);
        // then
        assertEquals(actual, "Fizz");
    }
}
