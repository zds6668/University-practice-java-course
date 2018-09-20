package com.test;

import java.util.*;

public class Test2 {
    public static void main(String[] args){
        Map map1 = new HashMap();
        map1.put("id", 001);
        map1.put("name", "弟弟");
        map1.put("salary", 5000);
        map1.put("hiredate", "2008-08");
        map1.put("depatment", "平台组");

        Map map2 = new HashMap();
        map2.put("id", 002);
        map2.put("name", "二哥");
        map2.put("salary", 3000);
        map2.put("hiredate", "2018-08");
        map2.put("depatment", "设计组");

        List <Map> list = new ArrayList<Map>();
        list.add(map1);
        list.add(map2);
        printEName(list);
    }

    public static void printEName(List <Map> list){
        for (int i = 0; i < list.size(); i++) {
            Map tmp = list.get(i);
            System.out.println(tmp.get("name"));

        }
        Iterator iterator = list.iterator();
        for (;iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
