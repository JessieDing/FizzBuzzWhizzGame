package com.jessie;

public class Student {
    private BaseHandler rule;

    public void setRule(BaseHandler baseHandler) {
        this.rule = baseHandler;
    }

    public String report(int number) {
        if (rule != null) {
            return rule.getResult(number);
        }
        return String.valueOf(number);
    }
}
