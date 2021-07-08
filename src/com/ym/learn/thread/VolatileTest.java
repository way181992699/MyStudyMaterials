package com.ym.learn.thread;

/**
 * volatile实现不同线程之间的资源可见性
 */
public class VolatileTest {
    private static volatile Boolean IntFlag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            while (!IntFlag) {
            }
            System.out.println("###################result");
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            setIntFlag();
        }).start();

        new Thread(() -> {
            third();
        }).start();

    }

    public static void setIntFlag() {
        System.out.println("###################start");
        IntFlag = true;
        System.out.println("###################end");
    }

    public static void third() {
        System.out.println(IntFlag);
    }
}
