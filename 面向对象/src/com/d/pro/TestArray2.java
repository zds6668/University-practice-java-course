package com.d.pro;

import java.util.Arrays;

public class TestArray2 {
    public static void printA(int[][] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int[][] a = {{1},{2},{3}}; //静态初始化
        int[][] s1 = {{1,3},{2,4}};
        int[][] s2 = {{3,4},{4,5}};
        int[][] c = new int[2][2];
        for(int i = 0; i<s1.length; i++){
            for (int j = 0; j < s1[i].length; j++) {
                c[i][j] = s1[i][j] + s2[i][j];
            }
        }
        printA(c);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.deepToString(c));

    }



}
