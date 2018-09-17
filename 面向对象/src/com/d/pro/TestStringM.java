package com.d.pro;

public class TestStringM {
    public static void main(String[] args){
        String s1 = "abcd帅";
        String s2 = "abcd帅";

        System.out.println(s1.charAt(4));
        System.out.println(s2.length());
        System.out.println(s2.indexOf("帅"));
        System.out.println(s1.substring(2));
        System.out.println(s2.replace("帅", "丑"));

        String[] s3 = s2.split("c");
        System.out.println(s3[0]);

        System.out.println(s2.toUpperCase());

        String 内存泄漏s = "a";
        for(int i = 0;i<3;i++){
            内存泄漏s += i; //造出了三个对象哦a,a0,a01,a02
        }
    }
}
