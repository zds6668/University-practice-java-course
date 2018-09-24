package com.syn;

public class Cinema {
    public static void main(String[] args){
        Cine cinema = new Cine(3, "新天地");
        new Thread(new people(cinema, 2), "小弟").start();
        new Thread(new people(cinema, 2), "大哥").start();
    }
}
class people implements Runnable{
    Cine cine;
    int seats;

    public people(Cine cine, int seats) {
        this.cine = cine;
        this.seats = seats;
    }

    @Override
    public void run() {
        boolean flag = cine.buyTick(seats);
        if (flag){
            System.out.println("买到票了" + Thread.currentThread().getName());
        }else{
            System.out.println("买票失败" + Thread.currentThread().getName());
        }
    }
}

class Cine{
    int avaliable;
    String name;
    public Cine(int avaliable,String name){
        this.avaliable =avaliable;
        this.name = name;
    }
    public boolean buyTick(int seats){
        System.out.println("可用位置有" + avaliable);
        synchronized ((Integer)avaliable){ //不加则两人都买到票
        if (avaliable >= seats){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            avaliable = avaliable-seats;
            return true;
        }return false;}
    }
}