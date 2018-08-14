package com.cathy.leetcode;

import java.util.Arrays;

public class _4_ScatterArray {
    public  static<T> T[] scatter(T[] arr, Integer maxSame) {
        if (arr == null || arr.length <= maxSame) {
            return arr;
        }
        Integer num = 1;
        Integer current = 0;
        while (current < arr.length - 1) {
            if (arr[current + 1] == arr[current]) {
                if (num == maxSame) {
                    Integer replace;
                    Integer different = findNextDiffrent(arr, current);
                    if (different != null) {
                        replace = current + 1;
                    } else {
                        different = findPrevDiffrent(arr, current);
                        replace = current - maxSame + 1;
                    }
                    swap(arr, replace, different);
                }
                num++;

            } else {
                num = 1;
            }
            current++;
        }
        return arr;
    }

    private static<T> void swap(T[] arr, Integer item1, Integer item2) {
        T tmp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = tmp;
    }

    private static<T> Integer findPrevDiffrent(T[] arr, Integer current) {
        if (current == 0) {
            return null;
        }
        for (int i = current - 1; i > 0; i--) {
            if (!arr[i].equals(arr[current])) {
                return i;
            }
        }
        return null;
    }

    private static<T> Integer findNextDiffrent(T[] arr, Integer current) {
        if (current == arr.length - 1) {
            return null;
        }
        for (int i = current + 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[current])) {
                return i;
            }
        }
        return null;
    }
}
