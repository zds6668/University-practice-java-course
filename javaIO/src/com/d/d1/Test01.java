package com.d.d1;

import java.io.*;

public class Test01 {
    public static void main(String[] args){
        File file = new File("ab.txt");
        InputStream inputS = null;
        try {
            inputS = new FileInputStream(file);
           /* int char1 = inputS.read();
            int char2 = inputS.read();
            int char3 = inputS.read();
            System.out.println((char)char1);
            System.out.println((char)char2);
            System.out.println((char)char3);*/
            int tmp;
           while ((tmp= inputS.read()) != -1){
               System.out.print((char)tmp);
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=inputS)inputS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
