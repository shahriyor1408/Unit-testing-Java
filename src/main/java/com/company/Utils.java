package com.company;

import java.util.Arrays;

public class Utils {

    public String checkForSame(String str) {
        return str;
    }

    public String checkForNotSame(String str) {
        return new String(str);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int i, int i1) {
        return i - i1;
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