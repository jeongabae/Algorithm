package com.study.baekjun.array_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1546 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[Integer.parseInt(br.readLine())];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(str[i]);
        }
        double M = score[0];
        for (int i = 0; i < score.length; i++) {
            if(score[i]>M){
                M = score[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum +=score[i]/M*100;
        }
        System.out.println(sum/score.length);
    }
}

/*
2등 답안
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] sj = new double[tc];
        double sum = 0;

        for(int i = 0; i < sj.length ; i++){
            sj[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sj);

        for(int j = 0; j < sj.length; j++){
            sj[j] = sj[j] / sj[sj.length-1] * 100;
            sum = sum + sj[j];
        }
        System.out.println(sum / sj.length);


    }
}
 */