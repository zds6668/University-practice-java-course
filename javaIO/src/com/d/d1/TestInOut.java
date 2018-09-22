package com.d.d1;

import java.io.*;

public class TestInOut {
    public static void main(String[] args){
        File sours = new File("ab.txt");
        File des = new File("des.txt");
        OutputStream outputStream = null;
        InputStream in = null;
        try {
            in = new FileInputStream(sours);
            outputStream = new FileOutputStream(des);
            byte[] flush = new byte[1024];
            in.read(flush);
            outputStream.write(flush, 0, 1024);
            outputStream.flush();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            if (null!=outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null!=in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
