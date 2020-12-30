package com.study.baekjun.array_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj8958 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String arr[] = new String[Integer.parseInt(br.readLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int correct = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    correct++;
                } else {
                    correct = 0;
                }
                sum += correct;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}
