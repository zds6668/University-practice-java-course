package com.d.pro;
/*
可变字符序列 stringbuilder，
StringBuffer线程安全的，效率较低  看了源码加了synchronized
 */
public class TestStringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("abc");
        sb.delete(0,2);
        System.out.println(sb);
        for(int i = 0; i < 10; i++){
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
