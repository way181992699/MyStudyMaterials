package com.ym.learn.DesignPattern.ObserverPattern;

public class OctalObserver extends Observer {

    public OctalObserver(One one) {
        this.one = one;
        this.one.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(one.getState()));
    }
}

