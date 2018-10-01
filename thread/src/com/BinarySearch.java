package com;

public class BinarySearch {
    public int search(int key, int[] array) {
        int l = 0, h = array.length - 1;
        while (l <= h) {
        int mid = l + (h - l) / 2;
        if (key == array[mid]) return mid;
        if (key < array[mid])  h = mid - 1;
        else l = mid + 1;
        }
        return -1;
}
}