package com.d.myArray;

import java.util.Date;

/**
 * 自制个ArrayList
 */
public class MyArrayList {
    /**
     * The value is used for object storage.
     */
    private Object[] value;

    /**
     * The size is the number of characters used.
     */
    private int size;

    public MyArrayList(){
        value = new Object[16];
    }
    public MyArrayList(int size){
        value = new Object[size];
    }

    public void add(Object obj){
        value[size] = obj;
        size++;
        if(size>=value.length){
            int newSize = value.length*2;
            Object[] newlist = new Object[newSize];
            for (int i = 0; i<size; i++){
                newlist[i] = value[i];
            }
        }
    }
    public int size(){
        return size;
    }

    public Object get(int index){
        if (index<0||index>size-1){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return value[index];
    }

    public Object set(int index, Object object){
        Object oldo = value[index];
        value[index] = object;
        return oldo;
    }
    public static void main(String[] args){
        MyArrayList mya = new MyArrayList();
        mya.add(new String("abc"));
        mya.add(new Date());
        for (int i = 0; i< mya.size; i++){
            System.out.println(mya.get(i));
        }
        System.out.println(mya.size());
    }
}
