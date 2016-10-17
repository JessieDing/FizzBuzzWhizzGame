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
            if (i % fizzNum == 0 & i % buzzNum == 0 & i % whizzNum == 0) {
                System.out.println(" FizzBuzzWhizz");
            } else if (i % fizzNum == 0 & i % buzzNum == 0) {
                System.out.println(" FizzBuzz");
            } else if (i % fizzNum == 0 & i % whizzNum == 0) {
                System.out.println(" FizzWhizz");
            } else if (i % buzzNum == 0 & i % whizzNum == 0) {
                System.out.println(" BuzzWhizz");
            } else if (i % fizzNum == 0 || String.valueOf(i).contains(numberArr[0])) {
                System.out.println(" Fizz");
            } else if (i % buzzNum == 0) {
                System.out.println(" Buzz");
            } else if (i % whizzNum == 0) {
                System.out.println(" Whizz");
            } else {
                System.out.println(i + "");
            }
        }
    }
}
