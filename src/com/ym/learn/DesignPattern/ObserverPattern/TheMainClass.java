package com.ym.learn.DesignPattern.ObserverPattern;

/**
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 */
public class TheMainClass {
    public static void main(String[] args) {
        One one = new One();

        new BinaryObserver(one);//依赖one 添加观察者
        new HexaObserver(one);//依赖one
        new OctalObserver(one);//依赖one

        one.setState(1);//当one 的状态发生改变时. 它所被依赖的三个对象也会发生改变
        one.setState(2);
        one.setState(10);
    }
}
