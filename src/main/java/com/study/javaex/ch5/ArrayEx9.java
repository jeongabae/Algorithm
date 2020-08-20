package com.study.javaex.ch5;

import java.util.*; //Arrays.toString()을 사용하기 위해 추가
public class ArrayEx9 {
    public static void main(String[] args){
        int[] code = {-4, -1, 3, 6, 11}; //불연속인 값들로 구성된 배열
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            int tmp = (int)(Math.random()*code.length);
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));
    }
}
