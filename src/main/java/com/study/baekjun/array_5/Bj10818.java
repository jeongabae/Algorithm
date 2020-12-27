package com.study.baekjun.array_5;

import java.util.Scanner;

public class Bj10818 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            list[i] = n;
        }
        int max = list[0];
        int min = list[0];
        for (int i = 0; i < N; i++) {
            if(list[i]>max){
                max = list[i];
            }else if(list[i]<min){
                min = list[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
