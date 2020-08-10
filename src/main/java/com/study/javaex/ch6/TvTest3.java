package com.study.javaex.ch6;

class Tv3 {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
class TvTest3 {
    public static void main(String[]args){
        Tv3 t1 = new Tv3();
        Tv3 t2 = new Tv3();
        System.out.println("현재 체널은 "+t1.channel+" 입니다.");
        System.out.println("현재 체널은 "+t2.channel+" 입니다.");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("현재 체널은 "+t1.channel+" 입니다.");
        System.out.println("현재 체널은 "+t2.channel+" 입니다.");
    }
}
