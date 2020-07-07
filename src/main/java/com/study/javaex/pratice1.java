package com.study.javaex;

import java.util.Scanner;

public class pratice1 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int input = Integer.parseInt(tmp);
        System.out.printf("%d", input);

        Scanner scanner2 = new Scanner(System.in);
        int input2 = scanner2.nextInt();
        System.out.printf("%d", input2);


    }
}
