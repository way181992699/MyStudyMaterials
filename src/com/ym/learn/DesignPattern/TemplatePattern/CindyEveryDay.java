package com.ym.learn.DesignPattern.TemplatePattern;

public class CindyEveryDay extends EveryDay {
    @Override
    void getUp() {
        System.out.println("Cindy每天起床第一件事是转个身继续睡;(o(∩_∩)o 哈哈,好可耐捏)");
    }

    @Override
    void eat() {
        System.out.println("Cindy为了减肥,每天都不想吃东西;(哎呀,很不好的饮食习惯呢)");
    }

    @Override
    void sleep() {
        System.out.println("Cindy每天都会00点之后才上床睡觉;('哇哦,那她一定是属猫的'  '滚蛋,她属猪的. 话说有属猫这个生肖吗?')");
    }
}
