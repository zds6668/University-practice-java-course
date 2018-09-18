package com.List;

import java.util.Date;

public class DefArraylist {
    Object[] elementData;
    private int size;


    public DefArraylist(){
        this(10);
    }

    public DefArraylist(int initCap){
        this.elementData = new Object[initCap];
    }

    public int size(){
        return size;
    }
    public void add(Object o){
        if (size == elementData.length){
            Object[] newO = new Object[elementData.length*2+2];
            System.arraycopy(elementData, 0, newO, 0, elementData.length);
            elementData = newO;
        }
        elementData[size++] = o;
    }

    public void remove(int index){
        if (index>0||index < size){
            System.arraycopy(elementData, index+1, elementData, index, size-index-1);
            elementData[--size] = null;
        }
    }
    public void remove(Object o){
        for (int i = 0; i <size; i++) {
            if (o.equals(elementData[i])){
                this.remove(i);
            }
        }
    }

    public Object get(int index){
        if (index>0||index < size){
            return elementData[index];
        }return null;
    }


    public static void main(String[] args){
        DefArraylist list = new DefArraylist(3);
        list.add(33);
        list.add("123");
        list.add(new Date());
        list.add("1b");
        System.out.println(list.size());
        list.remove("123");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
