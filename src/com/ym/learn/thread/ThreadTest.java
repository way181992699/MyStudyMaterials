package com.ym.learn.thread;

/**
 * @author wkx
 * @description 多线程测试类
 * @date 2019/8/1
 */
public class ThreadTest {

    private static boolean ready;
    private static int number = 20;
    private static final int PRINT_A = 0;
    private static final int PRINT_B = 1;
    private static final int PRINT_C = 2;

    private static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    /**
     * 一个多线程打印类
     */
    public static class ThreadPrint extends Thread {
        int which;
        static volatile int state;
        static final Object t = new Object();

        public ThreadPrint(int which) {
            this.which = which;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (t){
                    while (state % 3 != which) {
                        try {
                            t.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(toABC(which));
                    state++;
                    t.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
//        new ReadThread().start();
//        number = 42;
//        ready = true;

        new ThreadPrint(PRINT_A).start();
        new ThreadPrint(PRINT_B).start();
        new ThreadPrint(PRINT_C).start();
    }


    private static char toABC(int which) {
        return (char) ('A' + which);
    }
}


