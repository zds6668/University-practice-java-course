package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class RunnableDown implements Runnable{
    private String url;
    private String name;

    public static void main(String[] args){
        RunnableDown rd1 = new RunnableDown("http://pic.cifnews.com/upload/201710/09/201710091543185525.jpg", "1.jpg");
        RunnableDown rd2 = new RunnableDown("http://pic.cifnews.com/upload/201710/09/201710091543489142.png", "2.png");
        RunnableDown rd3 = new RunnableDown("http://img.cifnews.com/dev/20180917/527ea76e5e8647b7a48c8eb3b52b4297.jpg", "3.jpg");

        new Thread(rd1).start();
        new Thread(rd2).start();
        new Thread(rd3).start();
    }

    public RunnableDown(String url, String name){
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

