package com.jessie;

public class Student {
    private BaseHandler rule;

    public void setRule(BaseHandler baseHandler) {
        this.rule = baseHandler;
    }

    public String report(int number,NumberProcessor specialNumber) {


        if (rule != null) {
            return rule.getResult(number,specialNumber);// null ???
        }
        return String.valueOf(number);
    }
}
