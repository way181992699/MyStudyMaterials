package com.ym.learn.DesignPattern.StrategyPattern;

public class MidmonthWork implements Work {
    @Override
    public void thinking(Integer num1, Integer num2) {
        System.out.println("月中Seven对待工作的态度:老子不干了!!!!!!!ー(￣～￣)ξー(￣～￣)ξ, 所以参数相减 :" +(num1 - num2));
    }
}
