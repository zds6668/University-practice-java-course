package com.d.usedClass;

/**
 * 测试包装类
 * 自动装箱拆箱
 */
public class testInteger {
    public static void main(String[] args){
        Integer integer = new Integer("234");
        System.out.println(integer.equals(234));
        System.out.println(integer.MAX_VALUE);
        System.out.println(integer - 1);
        int i = integer.intValue();
        System.out.println(i);


        //自动装箱
        Integer integer1 = 1000;// Integer integer1 = new Integer(1000);
        int b = integer1; // b.intValue();

        Integer c = null;
//        System.out.println(c);
//        int d = c;//报错，空对象没有main，这里执行了intValue()方法

        Integer integer2 = 128;
        Integer integer3 = 128;
        System.out.println(integer2==integer3);
        Integer integer4 = 127; //[-128,127]之间运算当做基本数据类型
        Integer integer5 = 127;
        System.out.println(integer4==integer5);
    }


}
