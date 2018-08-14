package com.cathy.leetcode;

import java.util.Arrays;

public class _4_ScatterArray {
    public static Integer[] scatter(Integer[] arr, Integer maxSame) {
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
                    System.out.println(current);
                    System.out.println(different);
                    System.out.println(Arrays.toString(arr));
                }
                num++;

            } else {
                num = 1;
            }
            current++;
        }
        return arr;
    }

    private static void swap(Integer[] arr, Integer item1, Integer item2) {
        Integer tmp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = tmp;
    }

    private static Integer findPrevDiffrent(Integer[] arr, Integer current) {
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

    private static Integer findNextDiffrent(Integer[] arr, Integer current) {
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
