package com.study.javaex.Thread;

import javax.swing.JOptionPane;

public class ThreadHorse {
    public static void main(String[] args) {

        /** 말 쓰레드 5개 생성*/
//		Horse horse1 = new Horse("1", new Rank());
//		Horse horse2 = new Horse("2번", new Rank());
//		Horse horse3 = new Horse("3번", new Rank());
//		Horse horse4 = new Horse("4번", new Rank());
//		Horse horse5 = new Horse("5번", new Rank());
//
//
        /** 말 쓰레드 5개 실행*/
//		horse1.start();
//		horse2.start();
//		horse3.start();
//		horse4.start();
//		horse5.start();

        Thread myThread = null;
        for (int i = 1; i <= 5; i++) {
            myThread = new Horse(i+"번", new Rank());
            myThread.start();
        }


    } // end of main
} // end of class

class Horse extends Thread {
    /** 말의 이름 */
    String h_name = "";

    /** 총길이 */
    int meter = 100;

    /** 등수 매길 static 변수 */
    static int count = 1;

    /** Rank클래스 */
    Rank rank;

    /** 기본생성자 */
    public Horse() {
        // TODO Auto-generated constructor stub
    }

    /** 말의 이름과 객체를 만들 Rank생성 */
    public Horse(String h_name, Rank rank) {
        this.h_name = h_name;
        this.rank = rank;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            while (true) {
                /** 1~2000 사이의 난수 발생후 sleep */
                sleep((int) (Math.random() * 2000 + 1));

                System.out.println(h_name + " 말의 남은 거리 : " + meter);

                /** 말이 20미터 단위로 이동 */
                meter -= 20;

                /** meter가 0이되면 결승점이기 때문에 rank.finishLine(말의 이름)실행 */
                if (meter == 0) {
                    this.rank.finishLine(h_name);
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
    }

}

class Rank {
    /** 말의 등수 */
    int rank;

    public Rank() {
        // TODO Auto-generated constructor stub
    }

    public void finishLine(String name) {
        // TODO Auto-generated method stub
        rank = Horse.count++;
        System.out.println(name + " 말 " + rank + "등으로 결승점 도착");

        /** 1등 말일 경우 JOptionPane.showMessageDialog로 띄어준다 */

        if (rank == 1) {
            /** 첫번째 매개변수는 Frame지정인데 없기때문에 기본frame로 띄운다 없으면 null지정 가능. */
            JOptionPane.showMessageDialog(null, "1등말은 " + name + " 입니다 !!");
        }

    }

}

