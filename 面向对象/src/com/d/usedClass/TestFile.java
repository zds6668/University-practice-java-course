package com.d.usedClass;

import java.io.File;

public class TestFile {
    public static void main(String[] args){
        File file = new File("F:\\github\\java\\面向对象\\src");
        printFilePath(file, 0);
    }

    static void printFilePath(File file, int lev){
        for (int i = 0; i < lev; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()){
           File[] list = file.listFiles();
           for(File s:list){
               printFilePath(s, lev+1);
           }
        }
    }
}
