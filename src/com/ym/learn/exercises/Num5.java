package com.ym.learn.exercises;

/**
 * 4:(递归的使用)
 * 兔子问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问第二十个月的时候兔子对数为多少？
 * 可以用递归，也可以用其他方法，但要说明你选择的理由。
 */
public class Num5 {

    public static void main(String[] args) {
        System.out.println(getSum(20));
    }

    public static int getSum(int day){
        if (day==1||day==2){
            return 1;
        }else return getSum(day-1)+getSum(day-2);
    }

}
