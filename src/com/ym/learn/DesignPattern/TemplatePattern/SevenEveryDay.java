package com.ym.learn.DesignPattern.TemplatePattern;

public class SevenEveryDay extends EveryDay {
    @Override
    void getUp() {
        System.out.println("Seven每天起床第一件事是叠被子;(哇哦真是,真是一个好男人呢!)");
    }

    @Override
    void eat() {
        System.out.println("Seven每天都会吃蔬菜;");
    }

    @Override
    void sleep() {
        System.out.println("Seven每天都会10点之前上床睡觉;");
    }
}
