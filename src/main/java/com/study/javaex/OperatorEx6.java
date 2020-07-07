package com.study.javaex;

public class OperatorEx6 {
    public static void main(String []args) {
        byte a=10;
        byte b=20;
        byte c= (byte)(a+b);//컴파일 에러가 발생하지않도록 명시적으로 형변환.
        System.out.println(c);
    }
}
