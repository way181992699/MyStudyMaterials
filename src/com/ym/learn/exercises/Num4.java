package com.ym.learn.exercises;

/**
 * 3:(字符串的功能的考察)
 * 查找两个字符串的最大相同子串。
 * 比如："sadabcdfghjkl"和"werabcdtyu"的最大相同字串是：abcd
 */
public class Num4 {

    public static void main(String[] args) {
        String a = "abcwerthelloadcedf";
        String b = "cdhelloesadcedf";
        String c = getMaxSame(a, b);
        System.out.println(c);
    }

    public static String getMaxSame(String a, String b) {
        String max = "";
        String min = "";
        String temp = "";
        if (a.length() > b.length()) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        //String a="abcwerthelloadcedf";
        // String b="cdhelloesadcedf";
        for (int i = 0; i < min.length(); i++) {
            for (int j = 0; j <= i; j++) {
                int i1 = min.length() - i + j;
                String substring = min.substring(j, i1);//从小的字符串开始，从左向右移位比较
                System.out.println(substring);
                if (max.contains(substring)) {
                    if (temp.length() < substring.length()) {
                        temp = substring;
                    }
                }
            }
        }
        return temp;
    }
}