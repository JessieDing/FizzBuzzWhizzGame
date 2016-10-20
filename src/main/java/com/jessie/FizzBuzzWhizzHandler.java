package com.jessie;

public class FizzBuzzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int buzzNumber = 5;
        int whizzNumber = 7;
        if (number % fizzNumber == 0
                && number % buzzNumber == 0
                && number % whizzNumber == 0) {
            result = "FizzBuzzWhizz";
        }
        if (!result.equals("FizzBuzzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
