package com.Strategy;
/**
 * 策略模式， 其实是多态的自动转换
 * 算法互相的变化独立于使用算法的用户
 */

public class Strategy {
    public static void main(String[] args){
        King king = new King();
        king.run();
        king.fight();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
    }
}
class King extends Character{
    //国王用Sword
    public King(){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    void run() {
        System.out.println("国王骑车run");
    }
}