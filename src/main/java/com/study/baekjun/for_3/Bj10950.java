package com.study.baekjun.for_3;

import java.util.Scanner;

public class Bj10950 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] list = new int[num];

        for(int i=0;i<num;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            list[i] = A+B;
        }
        for (int i:list){
            System.out.println(i);
        }

    }
}
