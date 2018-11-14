package com.ym.learn.DesignPattern.StrategyPattern;

public class EarlyWork implements Work {
    @Override
    public void thinking(Integer num1, Integer num2) {
        System.out.println("月初Seven对待工作的态度:期待满满ヾ(o◕∀◕)ﾉヾ,  所以参数相加 : " + (num1 + num2));
    }
}
