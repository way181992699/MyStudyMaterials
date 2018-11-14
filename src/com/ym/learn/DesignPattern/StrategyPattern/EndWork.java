package com.ym.learn.DesignPattern.StrategyPattern;

public class EndWork implements Work {
    @Override
    public void thinking(Integer num1, Integer num2) {
        System.out.println("月末Seven对待工作的态度:呜呜呜(┬＿┬)::>_<::%>_<%,还是要干的~~~~~~o(≧口≦)oo(≧口≦)o, 所以参数相乘 :" +(num1 * num2));
    }
}
