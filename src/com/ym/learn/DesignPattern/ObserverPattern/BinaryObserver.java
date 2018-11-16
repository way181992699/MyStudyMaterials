package com.ym.learn.DesignPattern.ObserverPattern;

public class BinaryObserver extends Observer {

    public BinaryObserver(One one) {
        this.one = one;
        this.one.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(one.getState()));
    }
}
