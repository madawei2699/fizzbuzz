package com.thoughtworks;

public class FizzBuzz {

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz(i+1);
            System.out.println(result);
        }
    }

    public static String fizzBuzz(int digit) {
        if (digit % 3 == 0) {
            return "Fizz";
        }
        if (digit % 5 == 0) {
            return "Buzz";
        }
        if (digit % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(digit);
    }
}
