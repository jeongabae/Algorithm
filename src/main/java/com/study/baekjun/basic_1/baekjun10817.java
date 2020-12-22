package com.study.baekjun.basic_1;
//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class baekjun10817 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if((B<=A&&A<=C)||(C<=A&&A<=B)) {  //A가 중간값일때
            System.out.println(A);
        }
        else if((A<=B&&B<=C)||(C<=B&&B<=A)) {//B가 중간값일때
            System.out.println(B);
        }
            else{                           //C가 중간값일때
                System.out.println(C);
            }
        }
}
