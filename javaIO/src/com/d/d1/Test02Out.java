package com.d.d1;

import java.io.*;

public class Test02Out {
    public static void main(String[] args){
        File file = new File("ba.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);//append?true
            String msg = "IO is easy";
            byte[] b = msg.getBytes();
            outputStream.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null!=outputStream)
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
