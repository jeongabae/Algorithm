package com.study.baekjun.implementation;

import java.io.*;

public class Bj4101 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A,B;
        while(true){
            String[] str = br.readLine().split(" ");
            A = Integer.parseInt(str[0]);
            B = Integer.parseInt(str[1]);
             if(A==0&&B==0){
                break;
            }
            String st = "";
            st += (A > B) ? "Yes" : "No";
            bw.write(st+"\n");
            bw.flush();
        }
    }
}
