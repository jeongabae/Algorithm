//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
package com.study.backjun.basic;

import java.util.Scanner;

public class backun10871 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("N를 입력하세요.> ");
        int N = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("X를 입력하세요.> ");
        int X = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        int[] A = new int[N];


        if(1<=N && X<=10000)
            for(int i=1; i<=N;i++){
                System.out.printf("%d ",i);
            }

    }
}
