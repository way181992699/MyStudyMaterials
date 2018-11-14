package com.ym.learn.DesignPattern.StrategyPattern;

/**
 * 策略模式
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * <p>
 * 关键代码：实现同一个接口。
 */
public class TheMainClass {
    public static void main(String[] args) {
        Context context = new Context(new EarlyWork());
        context.executeStrategy(10, 7);
        context = new Context(new MidmonthWork());
        context.executeStrategy(10, 7);
        context = new Context(new EndWork());
        context.executeStrategy(10, 7);
    }
}
