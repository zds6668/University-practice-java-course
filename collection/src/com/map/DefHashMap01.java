package com.map;


import com.sun.glass.ui.Size;

public class DefHashMap01 {
    private int size;
    Kv[] kv = new Kv[100];

    public void put(Object key, Object value){
        for (int i = 0; i < size; i++) {
            if (kv[i].k.equals(key)){
                kv[i].v = value;
                return;
            }
        }Kv tmp = new Kv(key, value);
        kv[size++] = tmp;
    }

    public Object get(Object key){
        for (int i = 0; i < size; i++) {
            if (kv[i].k.equals(key)){
                return kv[i].v;
            }
        }return null;
    }

    public static void main(String[] args){
        DefHashMap01 m = new DefHashMap01();
        m.put("1",1);
        m.put("1",111);
        System.out.println(m.get("1"));
        System.out.println(m.size);

    }
}

class Kv{
    Object k;
    Object v;
    public Kv(Object k, Object v) {
        this.k = k;
        this.v = v;
    }
}