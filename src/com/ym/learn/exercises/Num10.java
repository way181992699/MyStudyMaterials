package com.ym.learn.exercises;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 9:(反射的使用)
 * ArrayList<Integer> list = new ArrayList<Integer>();
 * 在这个泛型为Integer的ArrayList中存放一个String类型的对象。
 */
public class Num10 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ArrayList<Integer> integerArraysList = new ArrayList<>();
        Class<? extends ArrayList> aClass = integerArraysList.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(integerArraysList, "存入字符串A");
        add.invoke(integerArraysList, "存入字符串B");
        for (Object integer : integerArraysList) {
            System.out.println(integer);
        }
    }

}
