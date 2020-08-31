package com.study.javaex.ch15;

import java.io.*;
public class BufferedReaderEx1 {
    public static void main(String[]args){
        try{
            FileReader fr = new FileReader("/Users/jeongabae/IdeaProjects/gabae1/src/main/java/com/study/javaex/ch15/BufferedReaderEx1.java");
            BufferedReader br  = new BufferedReader(fr);

            String line = "";
            System.out.println(br.toString());
            for(int i=1;(line = br.readLine())!=null;i++){
                System.out.println(line);
                if(line.indexOf(";")!= -1)
                    System.out.println(i+":"+line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
