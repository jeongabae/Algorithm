package com.study.baekjun.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10828 {
    static Stack st = new Stack();

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String back = "-1";
        while (N-->0){
            String[] str = br.readLine().split(" ");
            switch(str[0]) {
                case "push":
                    back = str[1];
                    st.add(back);
                    break;
                case "pop":
                    if (st.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(st.pop());
                    }
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "empty":
                    if (st.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    if (st.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(st.peek());
                    }
                    break;
            }
        }
    }
}
