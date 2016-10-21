package com.jessie;

import static java.lang.Integer.parseInt;

public class NumberProcessor {

    private String[] specialNumbers;   //成员变量

    public NumberProcessor() {       //构造函数（方法），与方法的区别在于无返回值。构造函数可以有多个
        Input input = new Input();
        specialNumbers = input.getNumbers().split(""); //构造函数里面为成员变量赋值
    }

    public int getFizzNumber() {
        String fizzNumber = specialNumbers[0];
        return parseInt(fizzNumber);
    }

    public int getBuzzNumber() {
        String buzzNumber = specialNumbers[1];
        return parseInt(buzzNumber);
    }

    public int getWhizzNumber() {
        String whizzNumber = specialNumbers[2];
        return parseInt(whizzNumber);
    }
}

