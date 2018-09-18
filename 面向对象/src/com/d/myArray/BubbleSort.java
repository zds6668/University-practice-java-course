package com.d.myArray;


import jdk.nashorn.internal.ir.ReturnNode;

import javax.sound.midi.Soundbank;
import java.time.temporal.Temporal;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] value = new int[10];
        for (int i = 0; i < 10; i++) {
            value[i] = (int)(Math.random()*10);
        }
        // toString方法打印
        System.out.println(Arrays.toString(value));

        BubbleSo(value);
        System.out.println(Arrays.toString(value));

        System.out.print("找到的下标为 " + BSearch(value, 3) + " 这个数为 ");
        System.out.println(value[BSearch(value, 3)]);

        for (int i: value){
            System.out.print(i);
        }
    }

    //冒泡排序
    public static void BubbleSo(int[] A){
        int temp;
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length-i-1; j++) {
                if (A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    //二分
    public static int BSearch(int[] Array, int tar){
        int left = 0, right = Array.length-1;
        while (left < right){
            int mid = left + (right - left)/2;
            if (Array[mid] == tar){
                return mid;
            }
            else if (tar < Array[mid]){
                right = mid;
            }
            else if (tar > Array[mid]){
                left = mid;
            }
        }
        return -1;
    }
}
