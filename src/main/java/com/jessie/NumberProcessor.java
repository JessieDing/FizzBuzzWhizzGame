package com.jessie;

import static java.lang.Integer.parseInt;

public class NumberProcessor {

    public Input input = new Input();
    public String[] specialNumbers = input.getNumbers().split("");

    public int getFizzNumber() {
        String fizzNumber = specialNumbers[0];
        return parseInt(fizzNumber);
    }

    public int getBuzzNumber() {
        String buzzNumber = specialNumbers[1];
        return parseInt(buzzNumber);
    }

    public int getWhizzNumber() {
        String whizzNumber = specialNumbers[2];
        return parseInt(whizzNumber);
    }
}

