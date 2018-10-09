package com.ym.learn.exercises;

import org.junit.jupiter.api.Test;

/**
 * java练习题
 */
public class No1 {
    @Test
    public void test() {
        /**
         * . 2.14  设计 Java  程序，假设有  50  瓶饮料，喝完三个空瓶可以换一瓶饮料，依次类推，请问
         * 总共喝了多少饮料。
         */
        int count = 50;
        int c = 50;
        while (true) {
            //   int b = 50 + 50 / 3 + c / 3 + c/3 +c;
            if (c > 2) {
                count += c / 3;
                c = No1.sheng(c);
            } else {
                break;
            }
        }
        System.out.println(count);

    }

    public static int sheng(int a) {
        if (a >= 3) {
            int sheng = (a % 3 + a / 3);
            return sheng;
        }
        return 0;
    }

    @Test
    public void test1() {
        int n = 50; //初始饮料总数
        int i = 0; //兑换次数
        while (true) {
            n -= 3; //喝 3 瓶
            n++; //兑换 1 瓶
            i++; //兑换次数+1
            if (n < 3) {
                System.out.println("共喝了" + (50 + i) + "瓶");
                break;
            }
        }
    }
}




