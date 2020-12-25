package com.study.baekjun.for_3;

import java.util.Scanner;

public class Bj10871 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] List = new int[N];

        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            List[i] = a;
        }
        for (int i:List){
            if(i<X){
                System.out.print(i+" ");
            }
        }

    }
}
