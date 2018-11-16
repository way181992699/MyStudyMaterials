package com.ym.learn.DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 * 该对象就是 一对多 的"一"
 */
public class One {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
