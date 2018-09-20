package com.test;


import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args){
        Employ e1 = new Employ(001,"弟弟", 5000, "2008-08", "平台组");
        Employ e2 = new Employ(002,"二哥", 3000, "2018-08", "设计组");
        List list = new ArrayList();
        list.add(e1);
        list.add(e2);
        Employ e = (Employ)list.get(1);
        System.out.println(e.getName());
    }
}
