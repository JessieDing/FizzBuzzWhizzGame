package com.jessie;

public class DefaultFizzHandler extends BaseHandler {
    @Override
    public String getResult(int number,NumberProcessor specialNumber) {
        String result = String.valueOf(number);
        int fizzNumber = specialNumber.getFizzNumber();
        int ten = 10;
        int hundred = 100;
        int thousand = 1000;

        if (number % ten == fizzNumber) {  //判断个位是否含有3
            result = "Fizz";
        } else if (number % hundred / ten == fizzNumber) {    // 判断十位是否含3；“/”除，先对100取余，后除以10，int是整型。注意余数定义
            result = "Fizz";
        }else if (number%thousand/hundred == fizzNumber){
            result = "Fizz";
        }
        if (!result.equals("Fizz") && this.getNextHandler() != null) {
            return this.getNextHandler().getResult(number,specialNumber);
        }
        return result;
    }
}
