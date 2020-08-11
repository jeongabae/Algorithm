package com.study.javaex.ch6;


class TvTest4{
    public static void main(String[]args){
        Tv4[] tvArr = new Tv4[3];

        for(int i=0;i<tvArr.length;i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i+10;
        }

    }
        }
class Tv4{
    public static void main(String args[]){
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 체널은 "+t.channel+" 입니다.");
    }
}