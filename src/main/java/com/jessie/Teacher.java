package com.jessie;

public class Teacher {
    public BaseHandler sayRules() {
        DefaultFizzHandler defaultFizzHandler = new DefaultFizzHandler();   //没有defaultFizzHandler 运行结果错误，如13不报
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

        //链状结果，defaultFizzHandler是第一个有NextHandler的，因此确保为第一位处理

        return defaultFizzHandler;
    }
}
