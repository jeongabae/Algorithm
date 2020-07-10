package com.study.javaex;

public class CharToCode {
    public static void main(String [] args) {
        char ch = 'A';
        int code = (int)ch; // ch애 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n",ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

    }
}
