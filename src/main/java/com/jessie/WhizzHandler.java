package com.jessie;

public class WhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        int whizzNumber = 7;
        if (number % whizzNumber == 0) {
            result = "Whizz";
        }
        if (!result.equals("Whizz") && this.getNextHandler() != null){
            return this.getNextHandler().getResult(number);
        }
        return result;
    }
}
