package com.study.javaex.ch6;

public class CallStackTest {
    public static void main(String[]args){
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println();
    }
}
