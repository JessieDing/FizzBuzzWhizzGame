package com.jessie;

public class WhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number, NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int whizzNumber = specialNumber.getWhizzNumber();
        if (number % whizzNumber == 0) {
            result = "Whizz";
        }
        if (!result.equals("Whizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number, specialNumber);
        }
        return result;
    }
}
