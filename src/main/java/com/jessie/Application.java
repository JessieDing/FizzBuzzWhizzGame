package com.jessie;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("说三个不同的特殊数（范围：1~9）");
        NumberProcessor numberProcessor = new NumberProcessor();
        BaseHandler rule = teacher.sayRules();   //sayRules 返回的是defaultFizzHandler
        Student student = new Student();
        student.setRule(rule);

        for (int number = 1; number <= 315; number++) {
            String result = student.report(number, numberProcessor);
            System.out.println(result);
        }
    }
}
