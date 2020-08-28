package com.study.javaex.ch15;

import java.io.*;
import java.util.ArrayList;

public class FileEx3 {
    static int totalFiles = 0;
    static int totalDirs = 0;

    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("USAGE : java FileEx3");
            System.exit(0);
        }
        File dir = new File(args[0]);

        if(!dir.exists() || !dir.isDirectory()){

        }
    }
}
