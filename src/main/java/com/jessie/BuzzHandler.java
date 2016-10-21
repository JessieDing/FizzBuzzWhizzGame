package com.jessie;

public class BuzzHandler extends BaseHandler {

    @Override
    public String getResult(int number,NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int buzzNumber = specialNumber.getBuzzNumber();
        if (number % buzzNumber == 0) {
            result = "Buzz";
        }
        if (!result.equals("Buzz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
