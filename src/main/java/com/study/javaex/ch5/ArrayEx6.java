/*
최대값과 최소갑 : 배열 요소 중,,,최대최소찾기
 */

package com.study.javaex.ch5;

public class ArrayEx6 {
    public static void main(String[]args){
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0]; //배열의 첫 번째 값으로 최값을 초기화 한다.소

        for(int i=1; i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }else if(score[i]<min){
                min = score[i];
            }
        }//end of for
        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }
}
