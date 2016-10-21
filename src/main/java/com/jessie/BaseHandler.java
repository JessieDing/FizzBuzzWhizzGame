package com.jessie;

public abstract class BaseHandler {
    private BaseHandler nextHandler;

    public BaseHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(BaseHandler handler) {
        this.nextHandler = handler;
    }

    public abstract String getResult(int number,NumberProcessor specialNumber);
}
