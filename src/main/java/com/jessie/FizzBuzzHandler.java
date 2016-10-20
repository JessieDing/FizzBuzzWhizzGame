package com.jessie;

public class FizzBuzzHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int buzzNumber = 5;
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            result = "FizzBuzz";
        }
        if (!result.equals("FizzBuzz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
