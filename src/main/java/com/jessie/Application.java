package com.jessie;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        BaseHandler rule = teacher.sayRules();   //sayRules 返回的是defaultFizzHandler
        Student student = new Student();
        student.setRule(rule);

        for (int number = 0; number <= 105; number++) {
            String result = student.report(number);
            System.out.println(result);
        }
    }
}
