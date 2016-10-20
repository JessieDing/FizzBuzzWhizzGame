package com.jessie;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        BaseHandler rule = teacher.sayRules();

        for (int number = 0; number <= 105; number++) {
            Student student = new Student();  //student为什么在for里面new出
            student.setRule(rule);
            String result = student.report(number);
            System.out.println(result);
        }
    }
}
