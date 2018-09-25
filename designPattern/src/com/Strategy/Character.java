package com.Strategy;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    abstract void run();

    public void fight(){
        //委托给行为类
        weaponBehavior.useWeapon();
    }

}
