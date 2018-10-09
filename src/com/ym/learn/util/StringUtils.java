package com.ym.learn.util;

public class StringUtils {
    public static boolean strIsEmpty(String name) {
        if (name != null && !"".equals(name.trim())) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String a = "         ";
        String a1 = "";
        String a2 = null;
        System.out.println(StringUtils.strIsEmpty(a));
        System.out.println(StringUtils.strIsEmpty(a1));
        System.out.println(StringUtils.strIsEmpty(a2));
        System.out.println(a.isEmpty());
        System.out.println(a1.isEmpty());
        System.out.println(a2.isEmpty());
    }
}
