package com.study.baekjun.for_3;

import java.util.Scanner;

public class Bj2739 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=9;i++)
            System.out.println(num+" * "+i+" = "+ num*i);
    }
}
