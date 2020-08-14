package com.study.javaex.ch6;

class Data1{
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    static void change(Data1 d) {
        d.x = 1000;
        System.out.println("change() : x= "+ d.x);
    }
}
