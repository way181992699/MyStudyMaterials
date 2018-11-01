package com.ym.learn.jvm.jvmLoad;

//public class Test extends TestBase{
public class Test  {

    private static Test test1 = new Test();
    private static int a = 2;
    private static int b = 2;

    static {
        System.out.println("【Test类静态块】a=" + a);
    }

    public Test() {
        System.out.println("【Test类构造方法】a=" + a);
        System.out.println("【Test类构造方法】b=" + b);
        System.out.println("【Test类实例】" + this.toString());
    }

    public static Test newInstance() {
        return test1;
    }
}
