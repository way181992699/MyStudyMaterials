package com.ym.learn.callback;

/**
 * @author wkx
 * @description 回调机制测试
 * @date 2019/8/1
 */
public class Cindy implements Student {

    @Override
    public void resolveQuestion(Callback callback) {
        //模拟解决问题
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.tellAnswer(3);
    }
}
