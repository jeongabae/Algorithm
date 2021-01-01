package com.study.baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//사실 잘 모르겠음 ..
public class Bj1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int i = 0;
        int sum = 0;
        while (B > 0) {
            i++;
            for (int j = 0; j < i; j++) {
                A--;
                B--;
                if (A <= 0) sum += i;
                if (B == 0) break;
            }
        }
        System.out.println(sum);
    }
}
