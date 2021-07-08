package com.ym.learn.callback;

/**
 * @author wkx
 * @description 回调机制测试类
 * @date 2019/8/1
 */
public class Teacher implements Callback {

    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        System.out.println("请问这道题的答案是?");
        student.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了,我的答案是" + answer);
    }
}
