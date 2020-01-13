package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_origin_string_when_given_input_is_not_match_any_rule() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(2);
        // then
        assertEquals("2", actual);
    }

    @Test
    public void should_return_Fizz_when_given_input_can_be_divided_by_3() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(3);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_Buzz_when_given_input_can_be_divided_by_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(5);
        // then
        assertEquals("Buzz", actual);
    }

    @Test
    public void should_return_Whizz_when_given_input_can_be_divided_by_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(7);
        // then
        assertEquals("Whizz", actual);
    }

    @Test
    public void should_return_FizzBuzz_when_given_input_can_be_divided_by_3_and_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(15);
        // then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void should_return_FizzWhizz_when_given_input_can_be_divided_by_3_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(3 * 7);
        // then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(5 * 7);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_given_input_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(3 * 5 * 7);
        // then
        assertEquals("FizzBuzzWhizz", actual);
    }
}
