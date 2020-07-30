package com.study.javaex;

import javax.swing.*;

public class ThreadEx13 {
    public static void main(String[]args){
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신값은"+input+"입니다.");
//        th1.interrupt();
        System.out.println("isInterrupted():"+th1.isInterrupted());

        if(th1.isInterrupted()) {
            ThreadEx13_2 th2 = new ThreadEx13_2();
            th2.start();
        }
    }
}

class ThreadEx13_1 extends Thread{
    public void run(){
        int i = 10;
        while (i!=0&&!isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<2500000000L;x++);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}


class ThreadEx13_2 extends Thread{
    public void run(){
        int i = 10;
        while (i!=0&&!isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<2500000000L;x++);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
        System.out.println("카운트가 종료되었습니다.");
    }
}