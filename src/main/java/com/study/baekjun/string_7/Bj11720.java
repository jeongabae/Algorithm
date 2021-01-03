package com.study.baekjun.string_7;

import java.io.*;

public class Bj11720 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

            String[] input = br.readLine().split("");
            int[] scores = new int[N];
            int sum = 0;

            for(int i = 0; i<N;i++) {
                scores[i] = Integer.parseInt(input[i]);
                sum+=scores[i];
            }


            bw.write(String.format("%d", sum));
        bw.flush();
    }
}
/*
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for(int i=0; i<len; i++)
            sum += s.charAt(i) - '0';

        System.out.println(sum);
    }
}
 */