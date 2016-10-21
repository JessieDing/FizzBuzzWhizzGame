package com.jessie;

public class FizzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number,NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int fizzNumber = specialNumber.getFizzNumber();
        int whizzNumber = specialNumber.getWhizzNumber();
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            result = "FizzWhizz";
        }
        if (!result.equals("FizzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
