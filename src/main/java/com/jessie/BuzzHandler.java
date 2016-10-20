package com.jessie;

public class BuzzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int buzzNumber = 5;
        if (number % buzzNumber == 0) {
            result = "Buzz";
        }
        if (!result.equals("Buzz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
