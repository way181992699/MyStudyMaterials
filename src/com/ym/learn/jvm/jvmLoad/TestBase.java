package com.ym.learn.jvm.jvmLoad;

public class TestBase {
    private static int base_a = 2;
    private static int base_b = 2;

    static {
        System.out.println("【父类静态块】 base_a="+base_a);
    }

    public TestBase(){
        System.out.println("【父类 构造方法】base_a=" + base_a);
        System.out.println("【父类 构造方法】base_b=" + base_b);
        System.out.println("【父类 实例】"+ this.toString());
    }
}
