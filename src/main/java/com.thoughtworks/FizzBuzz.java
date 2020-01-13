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
        if (String.valueOf(digit).contains("3") && !String.valueOf(digit).contains("5")) {
            return "Fizz";
        }
        if (digit % 3 == 0 && !String.valueOf(digit).contains("5")) {
            result += "Fizz";
        }
        if (digit % 3 == 0 && String.valueOf(digit).contains("7")) {
            result += "Fizz";
        }
        if (digit % 5 == 0 && !String.valueOf(digit).contains("7")) {
            result += "Buzz";
        }
        if (digit % 7 == 0) {
            result += "Whizz";
        }
        return !result.equals("") ? result : String.valueOf(digit);
    }
}
