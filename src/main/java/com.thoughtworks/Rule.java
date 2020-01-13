package com.thoughtworks;

public enum Rule {
    R3(3),
    R5(5),
    R7(7);

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public Boolean isContain(int digit) {
        return String.valueOf(digit).contains(String.valueOf(this.value));
    }

    public Boolean isValid(int digit) {
        return digit % value == 0;
    }
}
