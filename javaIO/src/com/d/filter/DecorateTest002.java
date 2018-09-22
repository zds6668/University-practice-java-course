package com.d.filter;

/**
 * 抽象组件
 * 具体组件
 * 抽象装饰类
 * 具体装饰类
 */
public class DecorateTest002 {
    public static void main(String[] args){
        Drink coffe = new Coffe();
        Drink sugar = new Sugar(coffe);//装饰
        Drink milk = new Milk(sugar); //装饰
        System.out.println(milk.cost() + "元的 " + milk.info());
    }
}
//抽象组件
interface Drink{
    double cost();
    String info();
}
//具体组件
class Coffe implements Drink{
    private String name = "咖啡";
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}
// 抽象装饰类，包含了对抽象组件的引用和以及装饰着公用的方法
abstract class Decorate implements Drink{
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }
}
class Milk extends Decorate{

    public Milk(Drink drink) {
        super(drink);
    }
    @Override
    public double cost() {
        return super.cost()*1.5;
    }

    @Override
    public String info() {
        return super.info() + "加了牛奶";
    }
}
class Sugar extends Decorate{

    public Sugar(Drink drink) {
        super(drink);
    }
    @Override
    public double cost() {
        return super.cost()*2;
    }

    @Override
    public String info() {
        return super.info() + "加了糖";
    }
}