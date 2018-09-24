package com.syn;

/**
 * 死锁
 */
public class  DeadLock{
    public static void main(String[] args){
        new Thread(new chose(0, "帅哥")).start();
        new Thread(new chose(1, "丑哥")).start();
    }
}
class L{

}

class M{

}
class chose extends Thread{
    static L l = new L();
    static M m = new M();
    int choice;
    String name;

    public chose(int choice, String name){
        this.name = name;
        this.choice = choice;
    }

    @Override
    public void run(){
        make();
    }

    private void make(){
        if (choice==0){
            synchronized (l){
                System.out.println(name + "的哦到了l");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (m){
                    System.out.println(name + "得到了m");
                }
            }
        }else{
            synchronized (m){
                System.out.println(name + "的哦到了m");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }synchronized (l){
                    System.out.println(name + "得到了l");
                }
            }
        }

    }
}