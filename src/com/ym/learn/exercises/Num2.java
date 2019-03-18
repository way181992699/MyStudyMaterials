package com.ym.learn.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，在传递过程中需要加密，加密规则如下：
 * 首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，最后将第一位和最后一位数字交换。
 * 请任意给定一个小于8位的整数，然后，把加密后的结果在控制台打印出来。
 */
public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();
        if (s2.length() > 7) {
            System.err.println("输入的数据最大为7位数,目前为:" + s2.length() + "位数");
            return;
        }
        char[] chars = s2.toCharArray();
        List<String> stringList = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>();
        for (char aChar : chars) {
            Character character = new Character(aChar);
            stringList.add(character.toString());
        }
        System.out.println(stringList);
        Collections.reverse(stringList);
        System.out.println(stringList);
        for (String s1 : stringList) {
            Integer i1 = (Integer.valueOf(s1) + 5) % 10;
            stringList1.add(i1.toString());
        }
        System.out.println(setSwop(stringList1));
    }

    public static String setSwop(List<String> chars) {
        String[] strings = chars.toArray(new String[chars.size()]);
        String aCharFirst = strings[0];
        String aChar1End = strings[strings.length - 1];
        strings[0] = aChar1End;
        strings[strings.length - 1] = aCharFirst;
        StringBuffer stringBuffer = new StringBuffer();
        for (String string : strings) {
            stringBuffer.append(string);
        }
        Integer value = Integer.valueOf(stringBuffer.toString());
        System.out.println(value);
        return stringBuffer.toString();
    }
}
