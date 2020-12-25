package com.study.baekjun.for_3;

import java.util.Scanner;

public class Bj11022 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[T];
        int[] aList = new int[T];
        int[] bList = new int[T];

        for(int i=0;i<T;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            aList[i] = A;
            bList[i] = B;
            list[i] = A+B;
        }
        for (int i=0;i<T;i++){
            System.out.println("Case #"+(i+1)+": "+aList[i]+" + "+bList[i]+" = "+list[i]);
        }

    }
}
