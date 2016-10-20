package com.jessie;

public class DefaultFizzHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int ten = 10;
        int hundred = 100;

        if (number % ten == fizzNumber) {
            result = "Fizz";
        } else if (number % hundred / ten == fizzNumber) {    // ？？？ “/”
            result = "Fizz";
        }
        if (!result.equals("Fizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
