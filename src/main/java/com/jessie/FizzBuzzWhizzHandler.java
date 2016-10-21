package com.jessie;

public class FizzBuzzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number, NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int fizzNumber = specialNumber.getFizzNumber();
        int buzzNumber = specialNumber.getBuzzNumber();
        int whizzNumber = specialNumber.getWhizzNumber();
        if (number % fizzNumber == 0
                && number % buzzNumber == 0
                && number % whizzNumber == 0) {
            result = "FizzBuzzWhizz";
        }
        if (!result.equals("FizzBuzzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number, specialNumber);
        }
        return result;
    }
}
