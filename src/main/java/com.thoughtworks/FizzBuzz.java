package com.thoughtworks;

public class FizzBuzz {

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }

    public static String fizzBuzz(int digit) {
        String result = "";

        if (Rule.R3.isContain(digit) && !Rule.R5.isContain(digit)) {
            return "Fizz";
        }
        if (Rule.R3.isValid(digit) && (!Rule.R5.isContain(digit) || Rule.R7.isContain(digit))) {
            result += "Fizz";
        }
        if (Rule.R5.isValid(digit) && !Rule.R7.isContain(digit)) {
            result += "Buzz";
        }
        if (Rule.R7.isValid(digit)) {
            result += "Whizz";
        }
        return !result.equals("") ? result : String.valueOf(digit);
    }
}
