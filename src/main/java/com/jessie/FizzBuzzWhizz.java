package com.jessie;

import java.util.Scanner;

public class FizzBuzzWhizz {

    public static void main(String[] args) {
        System.out.println("老师报三个数（1到9）");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] numberArr = number.split("");
        int fizzNum = Integer.parseInt(numberArr[0]);
        int buzzNum = Integer.parseInt(numberArr[1]);
        int whizzNum = Integer.parseInt(numberArr[2]);

        for (int i = 1; i < 101; i++) {
            if (i % fizzNum == 0) {
                System.out.print(" Fizz");
            }
            if (i % buzzNum == 0) {
                System.out.print(" Buzz");
            }
            if (i % whizzNum == 0) {
                System.out.print(" Whizz");
            }
            if (i % fizzNum == 0 & i % buzzNum == 0) {
                System.out.print(" FizzBuzz");
            }
            if (i % fizzNum == 0 & i % whizzNum == 0) {
                System.out.print(" FizzWhizz");
            }
            if (i % buzzNum == 0 & i % whizzNum == 0) {
                System.out.print(" BuzzWhizz");
            }
            if (i % fizzNum == 0 & i % buzzNum == 0 & i % whizzNum == 0) {
                System.out.print(" FizzBuzzWhizz");
            }
            if (String.valueOf(i).contains(numberArr[0])) {
                System.out.print(" Fizz");
            }
            System.out.println(i + "");
        }
    }
}
