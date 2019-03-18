package com.ym.learn.exercises;

/**
 * 2:(如何自己实现和API一样的功能)
 * public static String round(String str,int digit)
 * 参数1：数字和小数点组成的字符串。如"12.568"
 * 参数2：四舍五入的小数位数。如：2
 * 返回值：根据条件四舍五入后的字符串值。"12.57"
 * 注意：自行编写针对字符串操作的算法，不能使用Java现成的用于四舍五入的API方法
 */
public class Num3 {
    public static void main(String[] args) {
        System.out.println(round("12.958575", 1));
    }


    public static String round(String str, int digit) {
        String[] split = str.split("\\.");
        String s = split[1];
        Character c = null;
        try {
            c = s.charAt(digit);
        } catch (Exception e) {
            System.err.println("四舍五入的小数位过长,操作失败!");
            System.exit(0);
        }
        String substring = s.substring(0, digit);
        String s3 = split[0] + "." + substring;
        System.out.println(s3);
        Integer i1 = Integer.valueOf(substring);
        Integer i11 = Integer.valueOf(split[0]);
        System.out.println(i1);
        Integer judge = Integer.valueOf(c.toString());
        if (judge >= 5) {
            i1++;
            if (digit == 1 && i1 == 10) {
                i11++;
                return i11.toString() + "." + "0";
            }
        }
        return split[0] + "." + i1.toString();
    }
}
