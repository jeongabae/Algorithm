package com.study.baekjun.if_2;

import java.util.Scanner;

public class Bj2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number % 4 == 0 && number % 100 != 0)||number%400==0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
