package com.ym.learn.exercises;

import java.util.Set;
import java.util.TreeMap;

/**
 * 5:(Map集合的使用)
 * "cbxzbvavdvgd"获取字符串中，每一个字母出现次数：a(1)b(2)c(1)d(2)g(1)v(3)x(1)z(1)
 */
public class Num6 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        String str = "cbxzbvavdvgd";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            Integer i = treeMap.get(aChar);
            if (i == null) {
                treeMap.put(aChar, 1);
            } else {
                i++;
                treeMap.put(aChar, i);
            }
        }
        System.out.println(treeMap);
        Set<Character> characters = treeMap.keySet();
        StringBuilder builder = new StringBuilder();
        for (Character character : characters) {
            builder.append(character).append("(").append(treeMap.get(character).toString()).append(")");
        }
        System.out.println(builder.toString());
    }
}
