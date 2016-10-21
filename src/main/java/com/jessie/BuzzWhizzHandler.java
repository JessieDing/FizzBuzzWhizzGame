package com.jessie;

public class BuzzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number,NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int buzzNumber = specialNumber.getBuzzNumber();
        int whizzNumber = specialNumber.getWhizzNumber();
        if (number % buzzNumber == 0 && number % whizzNumber == 0) {
            result = "BuzzWhizz";
        }
        if (!result.equals("BuzzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
