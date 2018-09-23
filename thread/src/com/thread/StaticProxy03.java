package com.thread;

public class StaticProxy03 {
    public static void main(String[] args){
        new WeddingComp(new People()).Marry();
        //new Thread(new class).start()

    }
}

interface Marry{
    void Marry();
}

class People implements Marry{
    @Override
    public void Marry() {
        System.out.println("你久旱逢甘雨");
    }
}
class WeddingComp implements Marry{
    private Marry target;

    public WeddingComp(Marry target) {
        this.target = target;
    }

    @Override
    public void Marry() {
        ready();
        this.target.Marry();
        after();
    }
    void ready(){
        System.out.println("摆桌子");
    }
    void after(){
        System.out.println("收桌子");
    }
}