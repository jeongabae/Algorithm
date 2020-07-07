package com.study.javaex;

public class OperatorEx1 {
    public static void main(String []args) {
        int i = 5;
        i++; //i=i+1;과 같은 의미. ++i;로 바꿔써도 결과 같음
        System.out.println(i);

        i=5; // 결과 비교 위해 i를 다시 5로 변경ㄴ
        ++i;
        System.out.println(i);
    }
}
