package com.study.javaex.ch6;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white","auto",4);
    }

    Car2(Car2 c){ //인스턴스의 복사를 위한 생성자
    color = c.color;
    gearType = c.gearType;
    door = c.door;
    }

    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest3 {
    public static void main(String[]args){
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(c1); //c1의 복사본 c2를 생성
        System.out.println("c1의 color="+c1.color+",gearType="+c1.gearType+"door="+c1.door);
        System.out.println("c2의 color="+c1.color+",gearType="+c1.gearType+"door="+c1.door);

        c1.door = 100; //c1의 인스턴스변수 door의 값을 변경
        System.out.println("c1의 color="+c1.color+",gearType="+c1.gearType+"door="+c1.door);
        System.out.println("c2의 color="+c1.color+",gearType="+c1.gearType+"door="+c1.door);

    }
}
