package com.jessie;

public class FizzHandler extends BaseHandler {

    @Override
    public String getResult(int number,NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int fizzNumber = specialNumber.getFizzNumber();
        if (number % fizzNumber == 0) {
            result = "Fizz";
        }
        if (!result.equals("Fizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
