package com.study.javaex.ch7;

class DrawShape {
    public static void main(String[]args){
        Point[] p =
    }
}

class Shape{
    String color;
    void draw(){
        System.out.printf("[color=%s]%n",color);
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }

    String getXY(){
        return "("+x+","+y+")";
    }
}

class Circle extends Shape{
    Point center; //원의 원점좌표
    int r;

    Circle(){
        this(new Point(0,0),100); //Circle(Point center, int r)를 호출
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center=(%d,%d), r = %d, color = ")
    }
}

