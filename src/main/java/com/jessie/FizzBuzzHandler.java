package com.jessie;

public class FizzBuzzHandler extends BaseHandler {
    @Override
    public String getResult(int number, NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int fizzNumber = specialNumber.getFizzNumber();
        int buzzNumber = specialNumber.getBuzzNumber();
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            result = "FizzBuzz";
        }
        if (!result.equals("FizzBuzz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
