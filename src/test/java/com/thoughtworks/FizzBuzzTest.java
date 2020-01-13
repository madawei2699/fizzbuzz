package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 1. 让所有学生拍成一队，然后按顺序报数。
 * 2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
 * 3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
 * 4. 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。
 * 5. 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。
 * 6. 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
 * 7. 如果数字中包含了7，那么忽略规则6，并且忽略被5整除的判定，比如要报75的同学只报FIzz，其他case自己补齐。
 */

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
    public void should_return_Buzz_when_given_input_can_be_divided_by_3_and_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(15);
        // then
        assertEquals("Buzz", actual);
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
    public void should_return_Whizz_when_given_input_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(70);
        // then
        assertEquals("Whizz", actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(105);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_Fizz_when_given_input_contains_3() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(32);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_Fizz_when_given_input_contains_3_can_be_divided_by_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(30);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_contains_3_can_be_divided_by_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(35);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_contains_3_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(35);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_input_contains_3_can_be_divided_by_3_and_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(315);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_Buzz_when_given_input_contains_5_can_be_divided_by_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(15);
        // then
        assertEquals("Buzz", actual);
    }

    @Test
    // 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
    public void should_return_BuzzWhizz_when_given_input_contains_5_can_be_divided_by_5_and_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(35);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    public void should_return_Fizz_when_given_input_contains_7_can_be_divided_by_5() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(75);
        // then
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_FizzWhizz_when_given_input_contains_3_5_7() {
        // given
        // when
        String actual = FizzBuzz.fizzBuzz(357);
        // then
        assertEquals("FizzWhizz", actual);
    }
}
