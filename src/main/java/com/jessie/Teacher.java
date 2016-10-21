package com.jessie;

public class Teacher {
    public BaseHandler sayRules() {
        DefaultFizzHandler defaultFizzHandler = new DefaultFizzHandler();   //没有defaultFizzHandler 运行结果错误，不报含有3的数
        FizzHandler fizzHandler = new FizzHandler();
        BuzzHandler buzzHandler = new BuzzHandler();
        WhizzHandler whizzHandler = new WhizzHandler();
        FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
        FizzWhizzHandler fizzWhizzHandler = new FizzWhizzHandler();
        BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler();
        FizzBuzzWhizzHandler fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler();

        defaultFizzHandler.setNextHandler(fizzBuzzWhizzHandler);
        fizzBuzzWhizzHandler.setNextHandler(fizzBuzzHandler);
        fizzBuzzHandler.setNextHandler(fizzWhizzHandler);
        fizzWhizzHandler.setNextHandler(buzzWhizzHandler);
        buzzWhizzHandler.setNextHandler(fizzHandler);
        fizzHandler.setNextHandler(buzzHandler);
        buzzHandler.setNextHandler(whizzHandler);
        return defaultFizzHandler;
    }
}


//设置职责链
//链状结构，defaultFizzHandler是第一个有NextHandler的，因此确保为第一位处理
        /*
        职责链模式：
        使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
        将这个对象连成一条链，并沿着这条链传递该请求，知道有一个对象处理它为止。
         */



