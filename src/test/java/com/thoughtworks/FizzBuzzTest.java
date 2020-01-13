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
        String actual = FizzBuzz.fizzBuzz(70);
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

    @Test
    // 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
    public void should_return_Fizz_when_given_input_contains_3() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(32);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    // 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
    public void should_return_Fizz_when_given_input_contains_3_can_be_divided_by_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(30);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    // 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
    public void should_return_Fizz_when_given_input_contains_3_can_be_divided_by_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(35);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    // 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
    public void should_return_Fizz_when_given_input_contains_3_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(35);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    // 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
    public void should_return_Fizz_when_given_input_contains_3_can_be_divided_by_3_and_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(315);
        // then
        assertEquals("Fizz", actual);
    }
}
