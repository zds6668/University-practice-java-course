package com.Strategy;

public interface WeaponBehavior {
    void useWeapon();
}

class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("我用sword杀");
    }
}

class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("我用Knife杀");
    }
}