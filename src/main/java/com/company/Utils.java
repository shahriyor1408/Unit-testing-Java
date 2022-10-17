package com.company;

import java.util.Arrays;

public class Utils {

    public String checkForSame(String str) {
        String str2 = str;
        return str2;
    }

    public String checkForNotSame(String str) {
        String str2 = new String(str);
        return str2;
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sub(int i, int i1) {
        int sup = i - i1;
        return sup;
    }

    public int[] sortArray(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        return newArray;
    }

    public int getAppVersion() {
        return 3;
    }
}