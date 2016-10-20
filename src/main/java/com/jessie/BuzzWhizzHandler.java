package com.jessie;

public class BuzzWhizzHandler extends BaseHandler {
    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int buzzNumber = 5;
        int whizzNumber = 7;
        if (number % buzzNumber == 0 && number % whizzNumber == 0) {
            result = "BuzzWhizz";
        }
        if (!result.equals("BuzzWhizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
