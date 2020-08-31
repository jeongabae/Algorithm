package com.study.javaex.ch15;

import java.io.*;
public class RandomAccessFileEx3 {
    public static void main(String[]ars){
        int sum = 0;

        try{
            RandomAccessFile raf = new RandomAccessFile("score2.dat","r");
            int i = 4;

            while(true){
                raf.seek(i);
                sum += raf.readInt();
                i += 16;
            }
        } catch (EOFException e) {
           System.out.println("sum:"+sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
