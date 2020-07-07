package com.study.javaex;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N > ");
        int number = scanner.nextInt();
        if (2<= number && number <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
        else
            System.out.println("잘못된 입력입니다.");

        }
    }