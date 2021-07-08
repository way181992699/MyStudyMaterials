package com.ym.learn.callback;

import org.junit.jupiter.api.Test;

/**
 * @author wkx
 * @description Main方法
 * @date 2019/8/1
 */
public class Main {
    @Test
    public void test00() {
        Student student = new Cindy();
        Teacher teacher = new Teacher(student);
        teacher.askQuestion();
    }

    @Test
    public void test01() {
        Teacher teacher = new Teacher(new Student() {
            @Override
            public void resolveQuestion(Callback callback) {
                int count = 0;
                while (count < 5) {
                    count++;
                    System.out.println("思考" + count + "秒钟!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                callback.tellAnswer(7);
            }
        });
        teacher.askQuestion();
    }

}
