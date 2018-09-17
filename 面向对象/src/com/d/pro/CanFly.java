package com.d.pro;
/*
接口比抽象还抽象
 */

public interface CanFly {
    int MAX_SPEED = 300000;
    void fly();
}

interface Attack{
    void attack();
}

class FeiJi implements CanFly, Attack{

    @Override
    public void fly() {
        System.out.println("飞机飞速度不超过"+MAX_SPEED);
    }

    @Override
    public void attack() {
        System.out.println("还要重写Attack");
    }
}

class Man implements CanFly{

    @Override
    public void fly() {
        System.out.println("人也可以飞");
    }
}
