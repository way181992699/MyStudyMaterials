package com.ym.learn.DesignPattern.ObserverPattern;

/**
 * 观察者的抽象类
 */
public abstract class Observer {
    protected One one;
    public abstract void update();
}
