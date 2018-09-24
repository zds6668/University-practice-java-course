package com.syn;

import java.util.ArrayList;

public class SynTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list){
                list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        System.out.println(list.size());
    }
}
