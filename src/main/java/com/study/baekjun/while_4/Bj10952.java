package com.study.baekjun.while_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Bj10952 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> aList = new LinkedList<>();
        LinkedList<Integer> bList = new LinkedList<>();


        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            aList.add(A);
            bList.add(B);
            if(aList.getLast()==0&&bList.getLast()==0){
                break;
            }
            list.add(A+B);

        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
