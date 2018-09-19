package com.map;

import java.util.LinkedList;

/**
 * hashmap
 * 提升效率版02
 * 链表+数组
 */
public class DefHashMap02 {
    LinkedList[] list = new LinkedList[100];
    int size;

    public void put(Object key, Object value){
        Kv kv = new Kv(key, value);
        int a = key.hashCode()%100;
        if (list[a] == null){
            LinkedList tmp = new LinkedList();
            tmp.add(kv);
            list[a] = tmp;
        }else{
            LinkedList tmp = list[a];
            for (int i = 0; i < tmp.size(); i++) {
                Kv kv2 = (Kv)tmp.get(i);
                if (kv2.k.equals(key)){
                    kv2.v = value;
                    return;
                }
            }
        }
        size++;
    }

    public Object get(Object key){
        int a = key.hashCode()%100;
        if (list[a] != null ){
            LinkedList tmp = list[a];
            for (int i = 0; i < tmp.size(); i++) {
                Kv kv = (Kv) tmp.get(i);
                if (kv.k.equals(key)){
                    return kv.v;
                }
            }
        }return null;
    }
    public static void main(String[] args){
        DefHashMap02 m = new DefHashMap02();
        m.put("1",1);
        m.put("1",111);
        System.out.println(m.get("1"));
        System.out.println(m.size);
    }
}
