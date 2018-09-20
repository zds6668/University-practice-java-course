package com.test;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class TestMap01 {
    public static void main(String[] args){
        String testStr = "hello i m you didi, yes pleast trust i m you i i i i";
        Map<String,Node> map = new HashMap<String, Node>();
        String[] list2 = testStr.split(" ");
        for (String s: list2) {
            if (!map.containsKey(s)){
                map.put(s, new Node());
                map.get(s).setCount(1);
            }else{
                map.get(s).setCount(map.get(s).getCount()+1);
            }
        }
        Set<String> keys = map.keySet();
        for (String s: keys) {
            Node node = map.get(s);
            System.out.println("单词" + s + "次数" + node.getCount());
        }
    }
}

class Node{
    private String name;
    private int count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
