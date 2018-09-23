package com.thread;

public class Lambda04 {
    public static void main(String[] args){
        LThread thread;
        //thread.start(10);
        thread = new LThread(){public int start(int a){
            System.out.println(a+10);
            return 10;
        }
        };
        thread.start(100);
        thread = ((int a)-> {
            System.out.println(1);
            return 10;
        });
        thread.start(100);
    }
}
interface LThread{
    int start(int a);
}
class thread implements LThread{


    @Override
    public int start(int a) {
        return 0;
    }
}
