package com.study.baekjun.array_5;

import java.io.*;

public class Bj4344_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int subjectNum = Integer.parseInt(br.readLine());

        while(subjectNum-- > 0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int[] scores = new int[N];
            double avg = 0;

            for(int i = 0; i<N;i++) {
                scores[i] = Integer.parseInt(input[i+1]);
                avg+=scores[i];
            }

            avg/=N;
            double cnt = 0;
            for(int i : scores)
                if(i > avg) cnt+=1;

            bw.write(String.format("%.3f%%\n", cnt/N*100));
        }
        bw.flush();
    }
}
