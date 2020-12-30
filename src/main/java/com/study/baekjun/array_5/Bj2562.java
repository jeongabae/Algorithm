package com.study.baekjun.array_5;

import java.util.Scanner;
public class Bj2562 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        int max = list[0];
        int maxNum = 1;
        for (int i = 0; i < list.length; i++) {
            if(list[i]>max){
                max = list[i];
                maxNum = i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxNum);
    }
}
