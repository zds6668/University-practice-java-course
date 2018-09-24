package com.thread;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 线程的状态
 */
public class AllState {
    public static void main(String[] args){
        Thread t = new Thread(()->{
            System.out.println("------------");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.getState());

        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());


    }
}
