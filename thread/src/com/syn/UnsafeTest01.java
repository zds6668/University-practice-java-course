package com.syn;

public class UnsafeTest01 {
    public static void main(String[] args){
        UnsafeWeb web = new UnsafeWeb();
        new Thread(web, "球迷").start();
        new Thread(web, "伪球迷").start();
        new Thread(web, "黄牛").start();
    }
}

class UnsafeWeb implements Runnable{
    private int ticketNums = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag){
            test();
        }
    }
    public void test(){
        if(ticketNums<=0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ">>" + ticketNums--);
    }
}
