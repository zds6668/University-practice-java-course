package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ThreadDown extends Thread{

    public static void main(String[] args){
        ThreadDown td1 = new ThreadDown("http://pic.cifnews.com/upload/201710/09/201710091543185525.jpg", "1.jpg");
        ThreadDown td2 = new ThreadDown("http://pic.cifnews.com/upload/201710/09/201710091543489142.png", "2.png");
        ThreadDown td3 = new ThreadDown("http://img.cifnews.com/dev/20180917/527ea76e5e8647b7a48c8eb3b52b4297.jpg", "3.jpg");

        td1.start();
        td2.start();
        td3.start();
    }
    private String url;
    private String name;

    public ThreadDown(String url, String name){
        this.name = name;
        this.url = url;
    }
    @Override
    public void run() {
        down(url, name);
    }

    public void down(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
            System.out.println("run " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
