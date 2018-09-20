package com.set;

import java.util.HashMap;

public class DefHashSet {
    HashMap map;
    private static final Object PRESENT = new Object();

    public DefHashSet(){
        map = new HashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object o ){
        map.put(o, PRESENT);
    }
    public static void main(String[] args){
        DefHashSet set = new DefHashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        System.out.println(set.size());
    }
}
