package com.d.d1;

import java.io.*;

public class Test02 {
    public static void main(String[] args){
        File file = new File("ab.txt");
        InputStream flush = null;
        try {
            flush = new FileInputStream(file);
            byte[] b = new byte[1024];
            while(flush.read(b)!= -1) {
                String str = new String(b, 0, 1024 );
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
