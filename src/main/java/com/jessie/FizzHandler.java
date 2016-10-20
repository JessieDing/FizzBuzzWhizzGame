package com.jessie;

public class FizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        if (number % fizzNumber == 0) {
            result = "Fizz";
        }
        if (!result.equals("Fizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
