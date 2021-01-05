package com.study.baekjun.implementation;

import java.io.*;

public class Bj15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] sum = new int[T];
        for(int i=0;i<T;i++){
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            sum[i] = A+B;
            bw.write(sum[i]+"\n");
        }
        bw.flush();
    }
}
/*자바 1등 코드
import java.io.*;

public class Main {
    public static void main(String... args) throws IOException {
        int testCases = sumUntilNewLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < testCases; i++) {
            answer.append(sumUntilNewLine()).append('\n');
        }
        System.out.print(answer.toString());
    }

    public static int sumUntilNewLine() throws IOException {
        int sum = 0;
        int buf = 0;
        int c;
        while((c = System.in.read()) != '\n') {
            if (c == ' ') {
                sum += buf;
                buf = 0;
            } else {
                buf = (buf * 10) +(c - '0');
            }
        }
        sum += buf;
        return sum;
    }
}
 */