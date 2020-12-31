package com.study.baekjun.array_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4344 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < subjectNum; i++) {
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int[] score = new int[N];
            double sum = 0;

            for (int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(str[j+1]);
                sum += score[j];
            }
            double mean = (sum / N) ;

            double count = 0;
            for(int k = 0 ; k < N ; k++) {
                if(score[k] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}
