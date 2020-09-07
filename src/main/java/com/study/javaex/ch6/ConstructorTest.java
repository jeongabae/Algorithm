package com.study.javaex.ch6;

class Data10{
    int value;
}

class Data11{
    int value;

    Data11(int x){ //매개변수가 있는 생성자
       value = x;
    }
}

class ConstructorTest {
    public static void main(String[]args){
        Data10 d1 = new Data10();
        Data11 d2 = new Data11(10);
    }
}

