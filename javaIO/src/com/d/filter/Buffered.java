package com.d.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Buffered {
    public static void main(String[] args){
        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(), "utf-8"));
            String msg;
            while (( msg = reader.readLine())!=null){
                System.out.print(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(reader.lines());
    }
}
