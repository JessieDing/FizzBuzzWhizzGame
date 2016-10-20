package com.jessie;

public class FizzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int whizzNumber = 7;
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            result = "FizzWhizz";
        }
        if (!result.equals("FizzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
