package com.study.baekjun.array_5;

import java.util.Scanner;
public class Bj2577 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = Integer.toString(result);

        int[] count = new int[10];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
